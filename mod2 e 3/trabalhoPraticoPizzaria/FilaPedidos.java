package pizzaria;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaPedidos {	
	private Queue<String> myQueue = new LinkedList<>();
	private Scanner scanner = new Scanner(System.in);
	
	private String queueMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("MENU FILA PEDIDOS \n");
		sb.append("Escolha o menu desejado: \n");
		sb.append("1 - Inserir pedido na fila \n");
		sb.append("2 - Remover pedido da fila \n");		
		sb.append("3 - Sair");		
		System.out.println(sb.toString());
		
		return scanner.nextLine();
	}
	
	public void startQueue() {
		String selection = queueMenu();
		
		while(!selection.equals("3")) {
			switch(selection) {
			case "1":
				System.out.println("Informe o nome do cliente que irá entrar na fila: ");
				String item = scanner.nextLine();
				myQueue.add(item);
				System.out.println(myQueue);
				selection = queueMenu();
				break;
			case "2":
				System.out.println("Próximo cliente a ser atendido: " + myQueue.remove());
				System.out.println(myQueue);
				selection = queueMenu();
				break;
			default: 
				System.out.println("Opção inválida.");
				selection = queueMenu();
			}
		}		
	}
}
