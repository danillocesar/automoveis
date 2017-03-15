var app = angular.module('automoveis', [ 'ui.bootstrap', 'ngRoute', 'ui.mask', 'automoveis.controllers', 'automoveis.services', 'angularUtils.directives.dirPagination' ]);
app.config(
		function($routeProvider) {
			$routeProvider.when("/", {
				templateUrl : "pages/lista-automoveis.jsp",
				controller : "AutomoveisCtrl"
			})
			$routeProvider.when("/cadastraAutomoveis", {
				templateUrl : "pages/cadastra-automoveis.jsp",
				controller : "CadastraAutomoveisCtrl",
				params: { automovel: null }
			})
		});
