package br.com.fiap.resource;

import java.util.ArrayList;
import java.util.List;

public class EstoqueBO {

	 public static ProdutoTO consultarProduto(int codigo) {
	
	 switch (codigo) {
	 case 401:
	 return new ProdutoTO(codigo, "Camiseta branca", 4, 2.99);
	 case 402:
	 return new ProdutoTO(codigo, "Camiseta azul", 4, 2.99);
	 case 403:
	 return new ProdutoTO(codigo, "Camiseta rosa", 4, 2.99);
	 default:
	 return null;
//	 throw new AxisFault("Produto não encontrado");
	 }
	 }

	public static List<ProdutoTO> listar() {

		List<ProdutoTO> listaProdutos = new ArrayList<ProdutoTO>();

		listaProdutos.add(EstoqueBO.consultarProduto(401));
		listaProdutos.add(EstoqueBO.consultarProduto(402));
		listaProdutos.add(EstoqueBO.consultarProduto(403));
		listaProdutos.add(EstoqueBO.consultarProduto(404));
		
		return listaProdutos;

	}
}
