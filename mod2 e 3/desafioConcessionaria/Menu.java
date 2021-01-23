package lojaVeiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private Scanner scanner = new Scanner(System.in);	
	ArrayList<Cliente> clientes = new ArrayList<>();
	ArrayList<Vendedor> vendedores = new ArrayList<>();
	ArrayList<Carro> carros = new ArrayList<>();
	ArrayList<Moto> motos = new ArrayList<>();
	
	
	private String mostrarMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("#######---- MENU PRINCIPAL ----####### \n");		
		sb.append("Escolha a opção desejada: \n");
		sb.append("1 - Consultar carros \n");
		sb.append("2 - Consultar motos \n");
		sb.append("3 - Consultar clientes \n");
		sb.append("4 - Consultar vendedores \n");
		sb.append("5 - Cadastrar carro \n");
		sb.append("6 - Cadastrar moto \n");
		sb.append("7 - Cadastrar cliente \n");
		sb.append("8 - Cadastrar vendedor \n");
		sb.append("9 - Vender carro \n");
		sb.append("10 - Vender moto \n");
		sb.append("0 - Sair \n");
		
		System.out.println(sb.toString());		
		return scanner.nextLine();		
	}
	
	public void iniciar() {
		
		String selecao = mostrarMenu();
		
		while (!selecao.equals("0")) {
			switch(selecao) {
			case "1":
				System.out.println(carros);
				System.out.println();
				selecao = mostrarMenu();
				break;
			case "2":
				System.out.println(motos);
				System.out.println();
				selecao = mostrarMenu();
				break;
			case "3":
				System.out.println(clientes);
				System.out.println();
				selecao = mostrarMenu();
				break;
			case "4":
				System.out.println(vendedores);
				System.out.println();
				selecao = mostrarMenu();			
				break;
			case "5":			
				inserirCarro();								
				System.out.println();
				selecao = mostrarMenu();
				break;
			case "6":
				inserirMoto();								
				System.out.println();
				selecao = mostrarMenu();
				break;
			case "7":
				inserirCliente();
				System.out.println();
				selecao = mostrarMenu();
				break;
			case "8":				
				inserirVendedor();				
				System.out.println();
				selecao = mostrarMenu();
				break;
			case "9":
				venderCarro();
				System.out.println();
				selecao = mostrarMenu();
				break;
			case "10":
				venderMoto();
				System.out.println();
				selecao = mostrarMenu();
				break;
			default:
				System.out.println("Opção inválida.");
				selecao = mostrarMenu();
				break;
			}
		}
	}
	
	private void inserirCarro() {
		System.out.println("Informe o modelo do carro: ");
		String modeloC = scanner.nextLine();
		System.out.println("Informe a marca do carro: ");
		String marcaC = scanner.nextLine();
		System.out.println("Informe o ano do carro: ");
		String anoC = scanner.nextLine();
		System.out.println("Informe o valor do carro: ");
		String valorC = scanner.nextLine();
		
		System.out.println("Informe o índice com o nome do vendedor responsável: ");
		String indiceV = scanner.nextLine();				
		
		Carro carro = new Carro(modeloC, marcaC, Integer.valueOf(anoC), Double.valueOf(valorC), vendedores.get(Integer.parseInt((indiceV))));
		carros.add(carro);
		System.out.println("Carro adicionado com sucesso.");
		System.out.println(carros);
	}
	
	private void inserirMoto() {
		System.out.println("Informe o modelo da moto: ");
		String modeloM = scanner.nextLine();
		System.out.println("Informe a marca da moto: ");
		String marcaM = scanner.nextLine();
		System.out.println("Informe o ano da moto: ");
		String anoM = scanner.nextLine();
		System.out.println("Informe o valor da moto: ");
		String valorM = scanner.nextLine();
		
		System.out.println("Informe o índice com o nome do vendedor responsável: ");
		String indiceVe = scanner.nextLine();				
		
		Moto moto = new Moto(modeloM, marcaM, Integer.valueOf(anoM), Double.valueOf(valorM), vendedores.get(Integer.parseInt((indiceVe))));
		motos.add(moto);
		System.out.println("Moto adicionada com sucesso.");
		System.out.println(motos);
	}
	
	private void inserirCliente() {
		System.out.println("Informe o nome do cliente: ");
		String nomeC = scanner.nextLine();
		System.out.println("Informe o endereco do cliente: ");
		String endC = scanner.nextLine();
		System.out.println("Informe o cpf do cliente: ");
		String cpfC = scanner.nextLine();				
		
		Cliente cliente = new Cliente();
		cliente.setNome(nomeC);
		cliente.setEndereco(endC);
		cliente.setCpf(cpfC);				
		
		clientes.add(cliente);
		System.out.println("Cliente adicionado com sucesso.");
		System.out.println(clientes);
	}
	
	private void inserirVendedor() {
		System.out.println("Informe o nome do vendedor: ");
		String nomeV = scanner.nextLine();
		System.out.println("Informe a matrícula do vendedor: ");
		String matV = scanner.nextLine();
		System.out.println("Informe o cpf do vendedor: ");
		String cpfV = scanner.nextLine();				
		
		Vendedor vendedor = new Vendedor();
		vendedor.setNome(nomeV);
		vendedor.setMatricula(Integer.parseInt(matV));
		vendedor.setCpf(cpfV);				
		
		vendedores.add(vendedor);
		System.out.println("Vendedor adicionado com sucesso.");
		System.out.println(vendedores);
	}
	

	private void venderCarro() {
		System.out.println("Qual índice do carro que gostaria de vender? ");
		System.out.println(carros);
		String indexCarro = scanner.nextLine();
		System.out.println("Qual índice do cliente que está comprando? ");
		System.out.println(clientes);		
		String indexCliente = scanner.nextLine();
		carros.get(Integer.parseInt(indexCarro)).setCliente(clientes.get(Integer.parseInt(indexCliente)));		
	}
	
	private void venderMoto() {
		System.out.println("Qual índice da moto que gostaria de vender? ");
		System.out.println(motos);
		String indexMoto = scanner.nextLine();
		System.out.println("Qual índice do cliente que está comprando? ");
		System.out.println(clientes);		
		String indexCliente = scanner.nextLine();
		motos.get(Integer.parseInt(indexMoto)).setCliente(clientes.get(Integer.parseInt(indexCliente)));		
	}
}