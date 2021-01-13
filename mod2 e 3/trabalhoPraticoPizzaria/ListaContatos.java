package pizzaria;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaContatos {	
	private ArrayList<String> list = new ArrayList<String>();
	private Scanner scanner = new Scanner(System.in);
	
	private String listMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("MENU LISTA CONTATOS \n");
		sb.append("Escolha o menu desejado: \n");
		sb.append("1 - Consultar lista de contatos \n");
		sb.append("2 - Inserir contato na lista \n");
		sb.append("3 - Remover contato da lista \n");
		sb.append("4 - Sair \n");
		System.out.println(sb.toString());
		return scanner.nextLine();
	}
	
	public void startList() {
		String selection = listMenu();
		
		while (!selection.equals("4")) {
			switch(selection) {
			case "1":
				System.out.println(list);
				selection = listMenu();
				break;
			case "2":
				System.out.println("Informe o nome do contato para adicionar na lista: ");
				String item = scanner.nextLine();
				list.add(item);
				System.out.println(list);
				selection = listMenu();
				break;
			case "3":
				System.out.println("Informe o índice do contato que deseja remover: ");
				int index = Integer.valueOf(scanner.nextLine());
				list.remove(index);
				System.out.println(list);
				selection = listMenu();
				break;
			default:
				System.out.println("Opção inválida.");
				selection = listMenu();
			}
		}		
	}
}
