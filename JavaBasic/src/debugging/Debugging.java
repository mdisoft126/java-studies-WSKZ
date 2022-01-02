package debugging;

public class Debugging {
	public static void main(String[] args) {
		// x ^ y
		int x = 5;
		int y = 3;
		int result = 1;
		for(int i = y; i > 0; i--) {
			result *= x;
		}
		System.out.println(x + "^" + y + "= " + result);
	}
}
