package controle;

public class TestaError {
    @SuppressWarnings("unused")
	private static String[] sses;

	public static void main(String[] args) {
        sses = new String[Integer.MAX_VALUE];
    }
}