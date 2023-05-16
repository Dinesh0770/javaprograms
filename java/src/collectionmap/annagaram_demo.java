package collectionmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class annagaram_demo {

	public static void main(String[] args) {

		String str = "dinesh";

		char[] ch1 = str.toCharArray();

		for (int i = 0; i < ch1.length; i++) {

			System.out.print(ch1[i] + " ");

		}

		System.out.println("--------------------------------------------");

		String s1 = "welcome";
		String s2 = "welcomee";

		Map<Character, Integer> hm = new HashMap<>();

		for (Character ch : s1.toCharArray()) {

			if (hm.containsKey(ch)) {

				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}

		for (Character ch : s2.toCharArray()) {

			if (hm.containsKey(ch)) {

				hm.put(ch, hm.get(ch) - 1);
			} else {
				hm.put(ch, 1);
			}
		}

		Collection<Integer> v = hm.values();
		boolean flag = true;
		for (Integer val : v) {

			if (val != 0) {

				flag = false;

			}

		}

		if (flag) {

			System.out.println("string are anagram");
		} else {
			System.out.println("string not anagram");
		}

	}

}
