package ar;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of row");
		int row = sc.nextInt();

		System.out.println("enter the size of col");
		int col = sc.nextInt();

		int arr[][] = new int[row][col];

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				arr[i][j] = sc.nextInt();

			}

		}
		System.out.println("array of elements :");

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				System.out.print(arr[i][j] + "\t");

			}
			System.out.println("");
		}

	}

}
