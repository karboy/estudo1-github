package aplicacao;

import java.util.Scanner;

import entidades.Funcionario;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.name = ler.nextLine();
		System.out.print("Salario Bruto: ");
		func.salarioBruto = ler.nextDouble();
		System.out.print("Desconto: ");
		func.desconto = ler.nextDouble();
		
		System.out.printf("Empregado: %s, R$ %.2f%n", func.name, func.NetSalary());
		
		System.out.print("Entre com uma porcentagem para aumento de salário: ");
		func.increaseSalary(ler.nextDouble());
		
		System.out.printf("Info atualizado: %s, R$ %.2f%n", func.name, func.NetSalary());
		
		ler.close();
	}

}
