<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<div class="container">
	<div class="main-container">
		<div class="panel panel-default">
			<div class="panel-heading">Automóvel</div>
			<form class="panel-body" name="automovelForm" ng-submit="cadastraAutomovel(automovelForm.$valid)" novalidate>
				<div class="row">
				  <div class="col-xs-3 col-md-3">
				  	<label>Placa</label>
				  </div>
				  <div class="col-xs-3 col-md-3">
				  	<label>Modelo</label>
				  </div>
				  <div class="col-xs-3 col-md-3">
				  	<label>Marca</label>
				  </div>
				  <div class="col-xs-3 col-md-3">
				  	<label>Cor</label>
				  </div>
				</div>
				<div class="row">
				  <div class="col-xs-3 col-md-3">
				  	<input type="text" class="form-control" placeholder="Placa.." ng-model="tela.placa" required>
				  </div>
				  <div class="col-xs-3 col-md-3">
				  	<input type="text" class="form-control" placeholder="Modelo.." ng-model="tela.modelo" required>
				  </div>
				  <div class="col-xs-3 col-md-3">
				  	<input type="text" class="form-control" placeholder="Marca.." ng-model="tela.marca" required>
				  </div>
				  <div class="col-xs-3 col-md-3">
				  	<input type="text" class="form-control" placeholder="Cor.." ng-model="tela.cor" required>
				  </div>
				</div>
				<div class="filter-buttons">
					<button type="submit" class="btn btn-primary">Finalizar</button>
				</div>
			</form>
		</div>
	</div>
</div>