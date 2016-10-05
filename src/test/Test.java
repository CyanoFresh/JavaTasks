package test;

public class Test {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print('.');
			for (int k = i; k > 0; k--) {
				System.out.print('.');
			}
			System.out.println();
		}
	}

}
