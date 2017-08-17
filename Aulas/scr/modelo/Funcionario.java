package modelo;

abstract class Funcionario {
	protected double salario;
	protected String nome;
	protected String departamento;
	protected String entrada;
	protected String rg;
	protected static int identificador = 1;

	public Funcionario(String nome, String entrada, String departamento, double salario) {
		this.nome = nome;
		this.entrada = entrada;
		this.departamento = departamento;
		this.salario = salario;
		Funcionario.setIdentificador(identificador);
		identificador++;
	}

	public Funcionario() {
		Funcionario.setIdentificador(identificador);
		identificador++;
	}

	public void recebeAumentoDe(double aumento) {
		salario = this.salario + aumento;
	}

	public double getGanhoAnual() {
		return (salario * 12);
	}

	public boolean trabalha() {
		System.out.println(nome + " começou a trabalhar agora");
		return true;
	}

	public void mostraStatusDoFuncionario() {
		System.out.println("O nome do funcionário é " + nome);
		System.out.println("O salário do funcionário é " + salario);
		System.out.println("O departamento do funcionário é " + departamento);
		System.out.println("A data de entrada no banco do funcionário é " + entrada);
		System.out.println("O rg do funcionário é " + rg);
	}

	abstract double getBonificacao();

	public double getSalario() {
		return salario;
	}

	public String getNome() {
		return nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String getEntrada() {
		return entrada;
	}

	public String getRg() {
		return rg;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public static int getIdentificador() {
		return identificador;
	}

	public static void setIdentificador(int identificador) {
		Funcionario.identificador = identificador;
	}
}