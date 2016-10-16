package test;

public class Task4 {

	public static void main(String[] args) {
		int[] array = { 3, 4, 5, 56, 12, 45 };
		
		int min = (int)Double.POSITIVE_INFINITY;
		int max = (int)Double.NEGATIVE_INFINITY;
		
		int minIndex = 0;
		int maxIndex = 0;
		
		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			
			if (value < min) {
				min = value;
				minIndex = i;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			
			if (value > max) {
				max = value;
				maxIndex = i;
			}
		}
		
		array[minIndex] = max;
		array[maxIndex] = min;
		
		for (int value : array) {
			System.out.println(value + " ");
		}
	}

}
