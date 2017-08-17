package modelo;

public class ContaPoupanca extends Conta {
	public void atualiza(double taxa) {
		this.atualiza(taxa * 3);
	}

	public double deposita(double valor) {
		this.saldo += valor - 0.10;
		return this.saldo;
	}

	public void saca(double quantidade) {
		if (saldo >= quantidade) {
			this.saldo = this.saldo - quantidade;
		} else {
			throw new  RuntimeException("Saldo insuficiente");
		}
	}
}