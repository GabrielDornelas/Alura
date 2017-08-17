package modelo;

@SuppressWarnings("serial")
public class ValorInvalidoException extends RuntimeException {
	private double saldo;

	public ValorInvalidoException(double saldo) {
		super("Saldo Insuficiente:" + saldo);
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
}
