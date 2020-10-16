package entidades;

public class AdmBanco {
	
	private int numeroConta;
	private String nomeTitularConta;
	private double saldoConta;
	
	public AdmBanco() {
	}
	
	public AdmBanco(int numeroConta, String nomeTitularConta, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitularConta = nomeTitularConta;
		deposito(depositoInicial);
	}
	
	public AdmBanco(int numeroConta, String nomeTitularConta) {
		this.numeroConta = numeroConta;
		this.nomeTitularConta = nomeTitularConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitularConta() {
		return nomeTitularConta;
	}

	public void setNomeTitularConta(String nomeTitularConta) {
		this.nomeTitularConta = nomeTitularConta;
	}

	public void deposito(double quantidade) {
		saldoConta += quantidade;
	}
	
	public void saque(double quantidade) {
		saldoConta -= quantidade + 5;
	}
	
	public String toString() {
		return "\nInformações da Conta:\nConta: "
				+ numeroConta
				+ ", Nome: "
				+ nomeTitularConta
				+ ", Balanço: R$ "
				+ String.format("%.2f", saldoConta);
	}
}