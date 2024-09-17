package forInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee{
	 String name;
	 int age;
	 String gender;
	public Employee(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
public class EmployeeInfo {
	public static void main(String[] args) {
		List<Employee> emp= Arrays.asList(new Employee("arti", 25, "female"),
										new Employee("manish", 35, "male"),
										new Employee("rahul", 25, "male"),
										new Employee("priya", 30, "female"),
										new Employee("kavita", 25, "female"));
		Map<String, Long> findGender = emp.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(findGender);
		findGender.forEach((gender, count)->System.out.println("total emplyee: "+count+","+" gender: "+gender));
		findGender.entrySet().forEach(n->System.out.println(n.getKey()+":"+n.getValue()));
		long count = emp.stream().filter(emp1->"female".equals(emp1.gender)).count();
		System.out.println("print total female employee: "+count);
		System.out.println("print total male emplopee: "+
		emp.stream().filter(n->"male".equals(n.gender)).count()
		);
	}
}
