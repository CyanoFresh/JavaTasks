package test;

public class Task2 {

	public static void main(String[] args) {
		int[] array = { 4,5,6,1,23,73 };
		int sum = 0;
		
		for (int value : array) {
			sum += value;
		}
		
		int ser = sum / array.length;
		
		System.out.println(ser);
		
		for (int value : array) {
			if (value > ser) {
				System.out.print(value + " ");
			}
		}
	}

}
