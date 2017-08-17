package controle;

import modelo.ContaCorrente;

public class TestaDeposita {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		try{
			cc.deposita(-100);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
    }
}