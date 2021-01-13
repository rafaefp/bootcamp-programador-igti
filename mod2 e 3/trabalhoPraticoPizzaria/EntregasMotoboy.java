package pizzaria;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class EntregasMotoboy {	
	private Stack<Integer> myStack = new Stack<>();
	private Scanner scanner = new Scanner(System.in);
	
	private String stackMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("MENU ENTREGAS MOTOBOY \n");
		sb.append("Escolha o menu desejado: \n");
		sb.append("1 - Adicionar pedido \n");
		sb.append("2 - Organizar as entregas por ordem de distancia \n");		
		sb.append("3 - Desempilhar pedidos (mais próximo sai primeiro)  \n");		
		sb.append("4 - Sair");		
		System.out.println(sb.toString());
		
		return scanner.nextLine();
	}
	
	public void startStack() {
		String selection = stackMenu();
		
		while(!selection.equals("4")) {
			switch(selection) {
			case "1":
				System.out.println("Informe a distancia da casa do cliente: ");
				int distance = Integer.valueOf(scanner.nextLine());
				myStack.add(distance);
				System.out.println(myStack);
				selection = stackMenu();
				break;
			case "2":
				Collections.sort(myStack, Collections.reverseOrder());
				System.out.println(myStack);
				selection = stackMenu();
				break;
			case "3":
				System.out.println(myStack.pop());
				System.out.println(myStack);
				selection = stackMenu();
				break;			
			default:
				System.out.println("Opção inválida.");
				selection = stackMenu();
			}
		}		
	}	
}
