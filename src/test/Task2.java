package test;

public class Task2 {

	public static void main(String[] args) {
		int[] array = { 4,5,6,1,23,73 };
		int sum = 0;
		
		for (int value : array) {
			sum += value;
		}
		
		System.out.println(sum / array.length);
	}

}
