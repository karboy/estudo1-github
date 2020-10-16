package aplicacao;

import java.util.Scanner;

import entidades._90Classe;

public class _90Vetor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		_90Classe[] vetor = new _90Classe[10];
		
		System.out.print("Quantos quartos deseja alugar? ");
		int qtd = ler.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			ler.nextLine();
			System.out.println("\nAluguel #" + (i+1) + ":");
			System.out.print("Nome: ");
			String nome = ler.nextLine();
			System.out.print("Email: ");
			String email = ler.nextLine();
			System.out.print("Quarto: ");
			vetor[ler.nextInt()] = new _90Classe(nome, email);
		}
		
		System.out.println("\nQuartos ocupados:");
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}
		
		ler.close();
	}

}
