package test;

public class Task4 {

	public static void main(String[] args) {
		int num = 18;
		
		for (int i = 2; i <= num/i; i++) {
			if (num % i == 0 ) {
				System.out.println(num + " - Простое число");
				return;
			}
		}
		
		System.out.println(num + " - Не Простое число");
	}

}
