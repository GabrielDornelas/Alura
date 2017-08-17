package controle;

import modelo.AreaCalculavel;
import modelo.Retangulo;

public class TestaArea {
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.calculaArea());
	}
}