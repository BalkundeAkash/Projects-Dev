import java.util.Set;

/* 
HashSet :- 

1 . it is an class that implements set interface
2.  it iternally uses hashmap to store the data
3. not allow duplicate elements
4. allows only one null key
*/

public class HashSet {

	public static void main(String[] args) {

		Employee e1 = new Employee("john");

		System.out.println(e1); // john Employee@7ad041f3

		String s = e1.toString();
		System.out.println(s); // Employee@7ad041f3

	}

}

class Employee {

	String eId;

	@Override
	public String toString() {
		return "name = john";
	}

	public Employee(String eId) {

		this.eId = eId;
	}

}
