package pizzaria;

import java.util.Scanner;

public class Menu {
	private Scanner scanner = new Scanner(System.in);
	EntregasMotoboy entregasMotoboy = new EntregasMotoboy();
	FilaPedidos filaPedidos = new FilaPedidos();
	ListaContatos listaContatos = new ListaContatos();
	
	private String showMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("########### MENU PRINCIPAL ########### \n");
		sb.append("1 - Lista de Contatos \n");
		sb.append("2 - Fila de Pedidos \n");
		sb.append("3 - Entregas do Motoboy \n");
		sb.append("4 - Sair \n");
		System.out.println(sb.toString());
		return scanner.nextLine();		
	}
	
	public void startApp() {
		String selection = showMenu();
		
		while(!selection.equals("4")) {
			switch(selection) {
			case "1":
				listaContatos.startList();
				selection = showMenu();
				break;
			case "2":
				filaPedidos.startQueue();
				selection = showMenu();
				break;
			case "3":
				entregasMotoboy.startStack();
				selection = showMenu();
				break;
			default:
				System.out.println("Opção Inválida");
				selection = showMenu();
			}
		}
		scanner.close();
		System.out.println("Sistema finalizado.");
	}
}
