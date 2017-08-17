package controle;

import modelo.Data;
import modelo.Empresa;
import modelo.Gerente;

public class TestaEmpresa {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Gabriel");
		g1.setSalario(100);
		Data d = new Data();
		d.preencheData("1", "8", "2017");
		g1.setEntrada(d.getFormatada());
		g1.setDepartamento("T.I.");
		g1.setRg("46.052.594-3");

		Gerente g2 = new Gerente();
		g2.setNome("Daniel");
		g2.setSalario(50);
		Data da = new Data();
		da.preencheData("13", "8", "2017");
		g2.setEntrada(da.getFormatada());
		g2.setDepartamento("RH");
		g2.setRg("00.000.000-0");

		Empresa.empregados = new Gerente[10];

		Empresa.adicionar(g1);
		Empresa.adicionar(g2);

		Empresa.setNome("Siad");
		// Empresa.empregados[0].mostraStatusDoFuncionario();
		// Empresa.empregados[1].mostraStatusDoFuncionario();
		// Empresa.mostraEmpregados();
		Empresa.mostraTudo();

		Empresa.contem(g1);
	}

}