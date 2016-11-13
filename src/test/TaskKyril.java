package test;

import java.util.Scanner;

public class TaskKyril {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		float[] array = new float[10];
		int count = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Введите число: ");
			
			float input = s.nextFloat();
			
			array[i] = input;
			
			if (input > 0) {
				count++;
			}
			
			System.out.println(input);
		}
		
		System.out.println("Количество: " + count);
	}

}
