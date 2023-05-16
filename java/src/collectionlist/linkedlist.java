package collectionlist;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add(10);
		l.add("hello");
		l.add('z');
		l.add(101);
		l.add(10.45);
		l.add(10);

		System.out.println(l.get(2));

		System.out.println();
		System.out.println(l);
	}

}
