package collectionmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap_demo {

	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap<>();

		hm.put("xyz", 1);

		hm.put("xysz", 1);

		hm.put("xyzds", 11);

		hm.put("xyz", 13);

		hm.put("vvvxyz", 41);

		hm.put("rrtexyz", 18);

		System.out.println("size of hashmap :" + hm.size());

		System.out.println();

		System.out.println("value of key " + hm.get("xyz"));

		System.out.println();

		Set<String> k = hm.keySet();

		for (String key : k) {

			System.out.println(key + " ----- " + hm.get(key));

		}

		System.out.println();
		Set ent = hm.entrySet();

		System.out.println();

		Iterator it = ent.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

}
