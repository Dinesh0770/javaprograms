package collectionSet;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add(100);
		hs.add(1200);
		hs.add(100);
		hs.add(1210);
		hs.add(1040);

		System.out.println(hs);
		System.out.println(hs.size());

	}

}
