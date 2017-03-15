angular.module('automoveis.controllers', [])
.controller('AutomoveisCtrl', function($scope, $listaAutomoveis, $location, $removeAutomovel, $route, $filter) {
	$scope.tela = {};
    $scope.pageSize = 10;
    
    $scope.range = function(num) {
	    return new Array(Math.ceil(num/$scope.pageSize));   
	}
    
	$listaAutomoveis.get({}, function(response){
		$scope.tela.automoveis = response.entity;
	}, function(){
		alert("Não foi possível estabelecer conexão com o servidor.");
	});
	$scope.editarAutomovel = function(automovel){
		$location.path('/cadastraAutomoveis/').search({automovel: JSON.stringify(automovel)});
	}
	$scope.removerAutomovel = function(automovel){
		$removeAutomovel.save(automovel, function(response){
			alert(response.entity);
			$route.reload();
		},function(){
			alert("Não foi possível estabelecer conexão com o servidor.");	
		})
	}
})
.controller('CadastraAutomoveisCtrl', function($scope, $routeParams, $http, $addAutomovel, $route){
	$scope.tela = $routeParams.automovel?JSON.parse($routeParams.automovel):{};
	$scope.cadastraAutomovel = function(isValid){
		if(isValid){
			var obj = {
					id: $scope.tela.id?$scope.tela.id:0,
							placa: $scope.tela.placa,
							modelo: $scope.tela.modelo,
							marca: $scope.tela.marca,
							cor: $scope.tela.cor
			}
			$http.defaults.headers.common['contentType'] = 'application/json'
				$http.defaults.headers.common['accept'] = 'application/json'
					$addAutomovel.save(obj, function(result) {
						alert(result.entity);
						$route.reload();
					}, function(e) {
						alert("Não foi possível estabelecer conexão com o servidor.");
					})
		}else{
			alert("Preencha todos os campos");
		}
	}
})
