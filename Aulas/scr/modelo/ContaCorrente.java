package modelo;

public class ContaCorrente extends Conta implements Tributavel {
	public void atualiza(double taxa) {
		this.atualiza(taxa * 2);
	}

	public void saca(double quantidade) {
		if (saldo >= quantidade) {
			this.saldo = this.saldo - quantidade;
		} else {
			throw new  RuntimeException("Saldo insuficiente");
		}
	}

	public double deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(saldo);		
		} else {
			this.saldo += valor;
		}
		return this.saldo;
	}

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}