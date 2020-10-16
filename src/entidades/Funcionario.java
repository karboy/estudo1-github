package entidades;

public class Funcionario {
	public String name;
	public double salarioBruto;
	public double desconto;
	
	public double NetSalary() {
		return salarioBruto - desconto;
	}
	
	public void increaseSalary(double percent) {
		salarioBruto = salarioBruto * (percent / 100 + 1);
	}
}
