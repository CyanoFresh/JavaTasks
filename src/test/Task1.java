package test;

public class Task1 {

	public static void main(String[] args) {
		int[] array = { 12, 4, 5775, 765, 7765, 8, 5, 4, 3 };
		
		int needed = 4;
		int count = 0;

		for (int value : array) {
			if (value == needed) {
				count++;
			}
		}

		System.out.println(count);
	}

}
