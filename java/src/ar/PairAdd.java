package ar;

public class PairAdd {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int sum = 50;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == sum) {

					System.out.println(arr[i] + "+" + arr[j] + "=" + sum);

				}
			}

		}

	}

}
