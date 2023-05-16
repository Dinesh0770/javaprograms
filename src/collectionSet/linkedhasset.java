package collectionSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhasset {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

		lhs.add(100);
		lhs.add(500);
		lhs.add(200);
		lhs.add(100);
		lhs.add(600);
		lhs.add(40);
		lhs.add(1003);

		System.out.println(lhs);

		System.out.println();

		for (int ele : lhs) {

			System.out.println(ele);
		}

		System.out.println();

		Iterator itr = lhs.iterator();

		while (itr.hasNext()) {

			System.out.println("-->" + itr.next());
		}

	}

}
