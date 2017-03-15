package br.com.prova.automoveis.controller;



import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.prova.automoveis.entity.Automoveis;
import br.com.prova.automoveis.service.AutomoveisService;

@RestController
public class AutomoveisController {
	
	@Autowired
	AutomoveisService automoveisService;
	
	@RequestMapping("/automoveis/list")
    public Response filter() {
		return Response.ok().entity(automoveisService.lista()).build();
    }
	@RequestMapping(value = "/automoveis/add", method = RequestMethod.POST)
    public Response create(@RequestBody Automoveis automovel) {
    	try {
    		//tenta salvar
			automoveisService.save(automovel);
			//mensagem de sucesso
    		return Response.ok().entity("CADASTRO EFETUADO").build();
		} catch (Exception e) {
			e.printStackTrace();
			//mensagem caso algum erro interno ocarra
			return Response.serverError().entity("ERRO INTERNO").build();
		}
	}
	
	@RequestMapping(value = "/automoveis/delete", method = RequestMethod.POST)
    public Response delete(@RequestBody Automoveis automovel) {
    	try {
    		//tenta remover
			automoveisService.delete(automovel);
			//mensagem de sucesso
			return Response.ok().entity("AUTOMÓVEL REMOVIDO COM SUCESSO").build();
		} catch (Exception e) {
			e.printStackTrace();
			//mensagem caso algum erro interno ocarra
			return Response.serverError().entity("ERRO INTERNO").build();
		}
	}
}
