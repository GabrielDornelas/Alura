package modelo;

abstract class Conta {
	protected int numero;
	Funcionario titular;
	protected double saldo;
	protected double limite;
	protected double novoSaldo;

	abstract void saca(double quantidade);

	abstract double deposita(double valor);

	abstract void atualiza(double taxa);

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Funcionario getTitular() {
		return titular;
	}

	public void setTitular(Funcionario titular) {
		this.titular = titular;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}