package setimo;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o 1 número: ");
		int numUm = scan.nextInt();

		System.out.println("Digite o 2 número: ");
		int numDois = scan.nextInt();
		
		System.out.println("Escolha a Operação, Somar (+), Subtrair (-), Multiplicar (*), Dividir (/): ");
		String operacao = scan.next();

		switch (operacao) {
		case "+": {
			if (operacao.equals("+")) {

				int soma = numUm + numDois;
				System.out.println("Soma do números é: " + soma);
			}
			break;
		}
		case "-": {
			if (operacao.equals("-")) {
				
				int sub = numUm - numDois;
				System.out.println("Soma dos números é: " + sub);
			}
			break;
		}
		case "*": {
			if (operacao.equals("*")) {

				int mult = numUm * numDois;
				System.out.println("Soma dos números é: " + mult);
			}
			break;
		}
		case "/": {
			if (operacao.equals("/")) {

				double div = (double) numUm / numDois;
				System.out.println("Soma dos números é: " + div);
			}
			break;
		}

		default:
			System.out.println("Não e um operação.");
			break;
		}
		
		
	/*		int numUm, numDois;
			char operacao;
			
		if (operacao == "+") {
			System.out.println(numUm + numDois);
		}else if (operacao == "-") {
			System.out.println(numUm - numDois);
		}else if (operacao == "*") {	
			System.out.println(numUm * numDois);
		}else if (operacao == "/") {
			System.out.println(numUm / numDois);
		}else {
			System.out.println("Não e uma operação.");
		}
	*/
	}
}