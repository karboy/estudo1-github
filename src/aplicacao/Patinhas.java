package aplicacao;

import java.util.Scanner;
import entidades.AdmBanco;

public class Patinhas {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		AdmBanco admBanco;
		
		System.out.print("Entre com o número da Conta: ");
		int numeroConta = ler.nextInt();
		
		ler.nextLine();
		System.out.print("Entre com o nome do titular da Conta: ");
		String nomeTitularConta = ler.nextLine();
		
		System.out.print("Deseja depositar um valor (S/N)? ");
		char valorStart = ler.next().charAt(0);
		
		if (valorStart == 's') {
			System.out.print("\nEntre com o valor: ");
			double saldoConta = ler.nextDouble();
			admBanco = new AdmBanco(numeroConta, nomeTitularConta, saldoConta);
		} else {
			admBanco = new AdmBanco(numeroConta, nomeTitularConta);
		}
		
		System.out.println(admBanco);
		
		System.out.print("\nEntre com um depósito: ");
		admBanco.deposito(ler.nextDouble());
		
		System.out.println(admBanco);
		
		System.out.print("\nEntre com um saque: ");
		admBanco.saque(ler.nextDouble());
		
		System.out.println(admBanco);
		
		ler.close();
	}

}
