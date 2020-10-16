package aplicacao;

import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Retangulo retang = new Retangulo();
		
		System.out.println("Entre com largura e altura do retangulo: ");
		retang.largura = ler.nextDouble();
		retang.altura = ler.nextDouble();
		
		System.out.printf("AREA = %.2f%n", retang.area());
		System.out.printf("PERIMETRO = %.2f%n", retang.perimetro());
		System.out.printf("DIAGONAL = %.2f", retang.diagonal());
		
		ler.close();
	}

}
