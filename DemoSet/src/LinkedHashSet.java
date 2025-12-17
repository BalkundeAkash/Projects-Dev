/* 
 1. impl of set interface
 2. internally uses linkedhashmap to store the data as object
 3.allow null element
 4. allowed insertion order
 */

import java.util.Set;

public class LinkedHashSet {

	public static void main(String[] args) {

		Set<Integer> s = new java.util.LinkedHashSet();

		s.add(100);
		s.add(20);
		s.add(10);
		s.add(40);
		s.add(30);
		s.add(80);
		s.add(20);
		s.add(null);
		s.add(null);

		s.add(null);

		System.out.println(s);
	}
}
