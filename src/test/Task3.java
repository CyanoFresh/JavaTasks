package test;

public class Task3 {

	public static void main(String[] args) {
		int[] array1 = { 3, 4, 5 };
		int[] array2 = { 7, 6, 5 };
		int[] array3 = new int[array1.length];

		for (int i = 0; i < array3.length; i++) {
			array3[i] = array1[i] + array2[i];
		}

		for (int value : array3) {
			System.out.print(value + " ");
		}
	}

}
