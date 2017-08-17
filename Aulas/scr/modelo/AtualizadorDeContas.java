package modelo;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		// aqui vocÊ imprime o saldo anterior
		System.out.println("Saldo anterior -> " + c.getSaldo());
		// atualiza a conta com a taxa selic, e depois imprime o saldo final
		c.atualiza(this.selic);
		System.out.println("Saldo atualizado -> " + c.getSaldo());
		// lembrando de somar o saldo final ao atributo saldoTotal
		this.saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public double getSelic() {
		return selic;
	}
}