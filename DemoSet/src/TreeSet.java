/*
 1. IMPL of Set Interface
 2. allows duplicates auto removed
 3. natural sorting order
 4. sorting maintains depends on the content
 5 . not allowed null values
 
 */

import java.util.Set;

public class TreeSet {

	public static void main(String[] args) {

		Set<Integer> s = new java.util.TreeSet();

		s.add(1);
		s.add(5);
		s.add(3);
		s.add(4);
		s.add(2);

		System.out.println(s);
	}

}
