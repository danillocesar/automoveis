<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<div class="container">
	<div class="main-container">
		<div>
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>#</th>
						<th>Placa</th>
						<th>Modelo</th>
						<th>Marca</th>
						<th>Cor</th>
						<th>Ações</th>
					</tr>
				</thead>
				<tbody>
					<tr dir-paginate="automovel in tela.automoveis|itemsPerPage:5">
						<td>{{automovel.id}}</td>
						<td> {{automovel.placa}}</td>
						<td>{{automovel.modelo}}</td>
						<td>{{automovel.marca}}</td>
						<td>{{automovel.cor}}</td>
						<td>
							<span class="glyphicon glyphicon glyphicon-edit" aria-hidden="true" ng-click="editarAutomovel(automovel)"></span>
							<span class="glyphicon glyphicon glyphicon-remove" aria-hidden="true" ng-click="removerAutomovel(automovel)"></span>
						</td>
					</tr>
					<tr ng-if="tela.automoveis.length == 0">
						<td colspan="8" class="text-center">Nenhum registro localizado.</td>
					</tr>
				</tbody>
			</table>
			<dir-pagination-controls max-size="5" direction-links="false" boundary-links="false">
    </dir-pagination-controls>
		</div>
	</div>
</div>