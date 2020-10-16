package aplicacao;

import java.util.Scanner;

import entidades.CurrencyConverter;

public class _72Exercicio {

	public static void main(String[] args) {
		
		CurrencyConverter curCon = new CurrencyConverter();
		Scanner ler = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price? ");
		curCon.dollarPrice = ler.nextDouble();
		
		System.out.print("\nHow many dollars will be bought? ");
		curCon.qtdCompra = ler.nextDouble();
		
		System.out.printf("Amount to be paid in Reais = %.2f", curCon.totalPagarRS());
		
		ler.close();
	}

}
