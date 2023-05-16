package collectionmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class anagram_demo1 {

	public static void main(String[] args) {

		String str = "welcome";
		String str1 = "welcome";

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (Character ch : str.toCharArray()) {

			if (hm.containsKey(ch)) {

				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}

		}

		for (Character ch : str1.toCharArray()) {

			if (hm.containsKey(ch)) {

				hm.put(ch, hm.get(ch) - 1);
			} else {
				hm.put(ch, 1);
			}

		}

		Boolean flag = true;

		Collection<Integer> val = hm.values();

		for (Integer valu : val) {

			if (valu != 0) {
				flag = false;
			}

		}

		if (flag) {
			System.out.println("string are angram");
		}

		else {
			System.out.println("string are not angram");
		}

		Set e = hm.entrySet();

	}

}
