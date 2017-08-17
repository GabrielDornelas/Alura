package controle;

import modelo.Gerente;

public class TestaGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();

		// podemos chamar métodos do Funcionario:
		gerente.setNome("João da Silva");

		// e também métodos do Gerente!
		gerente.setSenha(4231);

		// teste de salario com bonificação
		gerente.setSalario(5000.0);
		System.out.println(gerente.getBonificacao());
	}
}