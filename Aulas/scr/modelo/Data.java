package modelo;

public class Data {
	public String ano;
	public String mes;
	public String dia;

	public void preencheData(String dia, String mes, String ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

		if (!isDataViavel(dia, mes, ano)) {
			System.out.println("A data " + getFormatada() + " não existe!");
		}
	}

	private boolean isDataViavel(String dia2, String mes2, String ano2) {
		if (Integer.valueOf(dia2) <= 0 || Integer.valueOf(mes2) <= 0) {
			return false;
		}

		int ultimoDiaDoMes = 31;
		if (Integer.valueOf(mes2) == 4 || Integer.valueOf(mes2) == 6 || Integer.valueOf(mes2) == 9
				|| Integer.valueOf(mes2) == 11) {
			ultimoDiaDoMes = 30;
		} else if (Integer.valueOf(mes2) == 2) {
			ultimoDiaDoMes = 28;
			if ((Integer.valueOf(ano2) % 400 == 0)
					|| ((Integer.valueOf(ano2) % 4 == 0) && (Integer.valueOf(ano2) % 100 != 0))) {
				ultimoDiaDoMes = 29;
			}
		}
		if (Integer.valueOf(dia2) > ultimoDiaDoMes) {
			return false;
		}

		return true;
	}

	public String getAno() {
		return ano;
	}

	public String getMes() {
		return mes;
	}

	public String getDia() {
		return dia;
	}

	public String getFormatada() {
		return getDia() + "/" + getMes() + "/" + getAno();
	}
}