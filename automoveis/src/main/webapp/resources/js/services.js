angular.module('automoveis.services', ['ngResource'])
.factory('$cadastraEditaAutomovel', function($resource) {
	return $resource('automovel/add?automovel=:automovel')
})
.factory('$listaAutomoveis', function($resource) {
	return $resource('automoveis/list')
})
.factory('$addAutomovel', function($resource) {
	return $resource('automoveis/add?automovel:automovel')
})
.factory('$removeAutomovel', function($resource) {
	return $resource('automoveis/delete?automovel:automovel')
})
