package controle;

import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TestaConta {
	public static void main(String args[]) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		cc.deposita(-1000);
		cp.deposita(1000);

		System.out.printf("O saldo é: %.2f", cc.getSaldo());
		System.out.printf("\nO saldo é: %.2f", cp.getSaldo());
	}
}