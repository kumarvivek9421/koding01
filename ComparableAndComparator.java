package forInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Emp implements Comparable<Emp>{
	int id;
	String name;
	int age;
	
	@Override
	public int compareTo(Emp o) {
		return this.id-o.id;  // its id wise sorting using Comparable
//		return this.name.compareTo(o.name);  // its name wise sorting using Comparable
	}
	
	public Emp(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

//Example of Comparator

class idWiseComparator implements Comparator<Emp>{
	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.id-o2.id;
	}
}
class nameWiseComparator implements Comparator<Emp>{
	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.name.compareTo(o2.name);
	}
}
public class ComparableAndComparator {
	public static void main(String[] args) {
		List<Emp> emp= new ArrayList<>();
		emp.add(new Emp(105, "vivek", 28));
		emp.add(new Emp(102, "arti", 22));
		emp.add(new Emp(104, "soni", 18));
		emp.add(new Emp(101, "priya", 20));
		emp.add(new Emp(103, "ram", 25));
		
		for(Emp e: emp) {
			System.out.println("normal method: "+e);
		}
		System.out.println();
		
//		for Comparable
		Collections.sort(emp);
		System.out.println("Comparable: "+emp+"\n");
		
		
//		for comparing to id wise using Comparator
		Collections.sort(emp, new idWiseComparator());
		System.out.println("Comparator: "+emp+"\n");
		
//		for comparing to name wise using Comparator
		Collections.sort(emp, new nameWiseComparator());
		System.out.println("Comparator: "+emp+"\n");
		
//		using Set
		Set<Emp> set= new TreeSet<>(new nameWiseComparator());
		set.add(new Emp(105, "vivek", 28));
		set.add(new Emp(102, "arti", 22));
		set.add(new Emp(104, "soni", 18));
		set.add(new Emp(101, "priya", 20));
		set.add(new Emp(103, "ram", 25));
		
		System.out.println("name wise using set: "+set);
	}
}
