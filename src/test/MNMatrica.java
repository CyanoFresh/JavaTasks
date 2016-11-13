package test;

import java.util.*;

public class MNMatrica {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Введите количество строк: ");
		int countOfRows = s.nextInt();
		
		System.out.print("Введите количество столбцов: ");
		int countOfColumns = s.nextInt();

		int[][] firstMatrix = new int[countOfRows][countOfColumns];
		int[][] secondMatrix = new int[countOfColumns][countOfRows];

		{
			int number = 1;
			
			for (int row = 0; row < countOfRows; row++) {
				for (int column = 0; column < countOfColumns; column++) {
					firstMatrix[row][column] = number;
					number++;
				}
			}
		}

		{
			for (int row = 0; row < countOfColumns; row++) {
				int number = row + 1;
				
				for (int column = 0; column < countOfRows; column++) {
					secondMatrix[row][column] = number;
					number += countOfColumns;
				}
			}
		}

		System.out.println();
		System.out.println("Первая матрица: ");
		System.out.println();
		
		for (int i[] : firstMatrix) {
			for (int m : i) {
				System.out.print(m + " ");
				if (m % countOfColumns == 0) {
					System.out.println();
				}
			}
		}

		System.out.println();
		System.out.println("Вторая матрица: ");
		System.out.println();
		
		for (int row = 0; row < secondMatrix.length; row++) {
			for (int column = 0; column < secondMatrix[row].length; column++) {
				System.out.print(secondMatrix[row][column] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int commonCount = 0;
		
		int minX = (secondMatrix.length < firstMatrix.length) ? secondMatrix.length : firstMatrix.length;
		
		for (int x = 0; x < minX; x++) {
			int minY = (secondMatrix[x].length < firstMatrix[x].length) ? secondMatrix[x].length : firstMatrix[x].length;
			
			for (int y = 0; y < minY; y++) {
				if (secondMatrix[x][y] == firstMatrix[x][y]) {
					commonCount++;
				}
			}
		}
		
		System.out.println("Количество повторяющихся: " + commonCount);
	}

}
