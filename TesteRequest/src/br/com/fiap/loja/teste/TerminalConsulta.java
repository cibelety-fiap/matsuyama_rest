package br.com.fiap.loja.teste;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.Scanner;

import br.com.fiap.loja.bo.EstoqueBOStub;
import br.com.fiap.loja.bo.EstoqueBOStub.ConsultarProduto;
import br.com.fiap.loja.bo.EstoqueBOStub.ConsultarProdutoResponse;
import br.com.fiap.loja.bo.EstoqueBOStub.ProdutoTO;

public class TerminalConsulta {
	
	public static void main(String[] args) throws RemoteException {
		
		LocalDate hoje = LocalDate.now();
		
	//	DateTimeFormatter formatador = DateTimeFormatter.ofPattern(PropertySingleton.getInstance().getProperty("mascara"));

		Scanner e = new Scanner(System.in);

		String nome = "abc";
//		System.out.println(nome);
//		System.out.println(hoje.format(formatador));


		System.out.println("\nInforme o código do produto: ");

		int codProduto = e.nextInt();
		e.close();
		
		EstoqueBOStub stub = new EstoqueBOStub();
		
		ConsultarProduto consulta = new ConsultarProduto();
		
		consulta.setCodigo(codProduto);
		
		ConsultarProdutoResponse response = 
				stub.consultarProduto(consulta);
		
		ProdutoTO produto = response.get_return();
		
		System.out.println(produto.getDescricao());
		
	}
}