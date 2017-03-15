<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Gestão de Processos</title>
    <link href="resources/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/main.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    <script src="resources/lib/angular/angular.min.js"></script>
    <script src="resources/lib/angular/angular-route.min.js"></script>
    <script src="resources/lib/angular/angular-resource.min.js"></script>
    <script src="resources/lib/angular/ui-bootstrap-tpls-2.5.0.min.js"></script>
    <script src="resources/lib/angular/angular-ui-mask.js"></script>
    <script src="resources/lib/angular/dirPagination.js"></script>
  	<script src="resources/js/main.js"></script>
  	<script src="resources/js/controllers.js"></script>
  	<script src="resources/js/services.js"></script>
  </head>
  <body ng-app="automoveis">
	<div ng-include="'templates/header.jsp'"></div>
	<div ng-view></div>
  </body>
</html>