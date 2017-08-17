package controle;

public class TestaExcecao {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		m1();
		System.out.println("Fim do main");
	}

	private static void m1() {
		System.out.println("Inicio do m1");
		try{
			m2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Problema !");
		}
		System.out.println("Fim do m1");
	}

	private static void m2() {
		System.out.println("Inicio do m2");
		int[] nums = new int[5];
		for(int i = 0; i < 6; i++) {
			nums[i] = i * 2;
			System.out.println(nums[i]);
		}
		System.out.println("Fim do m2");
	}
}