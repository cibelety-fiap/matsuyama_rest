package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/produto")
public class ProdutoResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<ProdutoTO> buscar(){
		return EstoqueBO.listar();
	}

}