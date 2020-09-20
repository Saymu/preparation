package e_data_structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Dog implements Comparator<Dog>, Comparable<Dog> {
	
	private String name;
	private int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		
		// Takes a list o Dog objects
		List<Dog> list = new ArrayList<Dog>();

		list.add(new Dog("Shaggy", 3));
		list.add(new Dog("Lacy", 2));
		list.add(new Dog("Roger", 10));
		list.add(new Dog("Tommy", 4));
		list.add(new Dog("Tammy", 1));
		Collections.sort(list); // Sorts the array list

		for (Dog a : list) // printing the sorted list of names
			System.out.print(a.getName() + ", ");

		// Sorts the array list using comparator
		Collections.sort(list);
		System.out.println(" ");

		for (Dog a : list) // printing the sorted list of ages
			System.out.print(a.getName() + "  : " + a.getAge() + ", ");

	}

	@Override
	public int compareTo(Dog o) {
		return (this.name).compareTo(o.name);
	}

	@Override
	public int compare(Dog o1, Dog o2) {
		return o1.age - o2.age;
	}

}
