package modelo;

public class Empresa {
	private static String nome;
	private String cnpj;
	private int[] Funcionario;
	private String endereco;
	static int livre = 0;

	public Empresa() {

	}

	public String getCnpj() {
		return cnpj;
	}

	public int[] getFuncionario() {
		return Funcionario;
	}

	public String getEndereco() {
		return endereco;
	}

	public static Funcionario[] getEmpregados() {
		return empregados;
	}

	public static void setNome(String nome) {
		Empresa.nome = nome;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setFuncionario(int[] funcionario) {
		Funcionario = funcionario;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public static void setEmpregados(Funcionario[] empregados) {
		Empresa.empregados = empregados;
	}

	public static int k = 1;
	public static Funcionario[] empregados;

	public Empresa(int qtdFuncionarios) {
		empregados = new Funcionario[qtdFuncionarios];
	}

	public static void adicionar(Funcionario f) {
		Empresa.empregados[livre] = f;
		livre++;
	}

	public static void mostraEmpregados() {
		for (modelo.Funcionario x : empregados) {
			if (x == null)
				continue;
			System.out.println("Funcionário na posição " + k + " seu nome é " + x.getNome() + " e seu salário é "
					+ x.getSalario());
			k++;
		}
	}

	public static void mostraTudo() {
		System.out.println("Empresa " + Empresa.getNome());
		for (modelo.Funcionario x : empregados) {
			if (x == null)
				continue;
			System.out.println("Funcionário " + k + " ");
			x.mostraStatusDoFuncionario();
			k++;
		}
	}

	public static boolean contem(Funcionario f) {
		for (int i = 0; i < Empresa.livre; i++) {
			if (f == Empresa.empregados[i]) {
				System.out.println("true");
				return true;
			}
		}
		System.out.println("false");
		return false;
	}

	private static String getNome() {
		return nome;
	}
}