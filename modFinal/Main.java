package folhaPagamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		MainMenu menu = new MainMenu();	
		menu.start();
	}	
}

class MainMenu {
	private Scanner scanner = new Scanner(System.in);	
	ArrayList<String> nomes = new ArrayList<>();
	ArrayList<Double> salarios = new ArrayList<>();
	
	private String showMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("======== CONTROLE DE FOLHA DE PAGAMENTO ========\n");
		sb.append("MENU\n");
		sb.append("1 - Cadastrar Funcionário\n");
		sb.append("2 - Imprimir Contracheque\n");
		sb.append("0 - Sair\n");
		sb.append("================================================\n");
		
		System.out.println(sb.toString());
		return scanner.nextLine();
	}
	
	public void start() {
		String index = showMenu();
		while (!index.equals("0")) {
			switch (index) {
			case "1":
				System.out.println("Informe o nome do funcionário: ");
				String nome = scanner.nextLine();
				System.out.println("Informe o salário bruto do funcionário: ");
				String salarioBruto = scanner.nextLine();
				nomes.add(nome);
				salarios.add(Double.valueOf(salarioBruto));				
				index = showMenu();
				break;
			case "2":
				System.out.println("Qual o índice do funcionário que deseja imprimir o contracheque? ");
				Integer indice = scanner.nextInt();
				double aliquotaInss1 = 78.38;
				double aliquotaInss2 = 94.01;
				double aliquotaInss3 = 125.38;
				double maiorAliq1 = 2089.60;
				double maiorAliq2 = 3134.40;
				double maiorAliq3 = 6101.06;
				double menorAliq = 1045;
				double descInss = 0;
				if (salarios.get(indice) <= menorAliq) {
					menorAliq = salarios.get(indice);
					descInss = (menorAliq*7.5)/100;
				} else if ((salarios.get(indice) >= 1045.01)&&(salarios.get(indice) <= maiorAliq1)) {
					maiorAliq1 = salarios.get(indice);
					aliquotaInss2 = ((maiorAliq1-1045.01)*9)/100;
					descInss = aliquotaInss1 + aliquotaInss2;
				} else if ((salarios.get(indice) > 2089.60)&&(salarios.get(indice) <= maiorAliq2)) {
					maiorAliq2 = salarios.get(indice);
					aliquotaInss3 = ((maiorAliq2-2089.61)*12)/100;
					descInss = aliquotaInss1 + aliquotaInss2 + aliquotaInss3;
				} else if ((salarios.get(indice) > 3134.40)&&(salarios.get(indice) <= maiorAliq3)) {
					maiorAliq3 = salarios.get(indice);
					double aliquotaInss4 = ((maiorAliq3-3134.41)*14)/100;
					descInss = aliquotaInss1 + aliquotaInss2 + aliquotaInss3 + aliquotaInss4;
				} else {
					descInss = 713.10;
				}
				
				double salarioMenosInss = salarios.get(indice)-descInss;
				double descIrrf = 0;
				
				if (salarioMenosInss <= 1903.98) {
					descIrrf = 0;
				} else if ((salarioMenosInss >= 1903.99)&&(salarioMenosInss <= 2826.65)) {
					descIrrf = ((salarioMenosInss*7.5)/100)-142.80;
				} else if ((salarioMenosInss >= 2826.66)&&(salarioMenosInss <= 3751.05)) {
					descIrrf = ((salarioMenosInss*15)/100)-354.80;
				} else if ((salarioMenosInss >= 3751.06)&&(salarioMenosInss <= 4664.68)) {
					descIrrf = ((salarioMenosInss*22.5)/100)-636.13;
				} else {
					descIrrf = ((salarioMenosInss*27.5)/100)-869.36;
				}
				
				double salarioLiquido = salarioMenosInss-descIrrf;
				
				System.out.println("Funcionário: " + nomes.get(indice));
				System.out.printf("Salário Bruto: R$ %.2f\n", salarios.get(indice));
				System.out.printf("Desconto INSS: R$ %.2f\n", descInss);
				System.out.printf("Desconto IRRF: R$ %.2f\n", descIrrf);
				System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);
				scanner.nextLine();
				index = showMenu();				
				break;
			default:
				System.out.println("Opção Inválida.");
				index = showMenu();
				break;
			}
		}
		System.out.println("Programa Finalizado.");
	}
}