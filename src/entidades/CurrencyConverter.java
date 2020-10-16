package entidades;

public class CurrencyConverter {
	
	public static final double porCento = 1.06;	
	public double dollarPrice, qtdCompra;
	
	
	public double totalPagarRS() {
		return dollarPrice * qtdCompra * porCento;
	}	
}