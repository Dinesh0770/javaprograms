package collectionmap;

public class anagramNew {

	public static void main(String[] args) {

		String str = "dinesh";

		String str1 = "dinesh";

		String s = str.toLowerCase();
		String s1 = str1.toLowerCase();

		char[] arr = s.toCharArray();

		char[] arr1 = s1.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println(s.equals(s1));

		System.out.println(arr.equals(arr1));

		if (arr.length == arr1.length) {

			if (arr.equals(arr1)) {

				System.out.println("anagram");
			} else {
				System.out.println("not");
			}
		}

		else {

			System.out.println("not anagram");

		}

	}

}
