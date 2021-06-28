package packageOne;

import defau.Person;
import packageTwo.ProtectedSubClass;

public class AccessModifiers {

	public static void main(String[] args) {
		Person adam = new Person();
		adam.age = 25;
		
		System.out.println("Age: " + adam.age);
		
		ProtectedSubClass psc = new ProtectedSubClass();
		psc.printID();
	}

}
