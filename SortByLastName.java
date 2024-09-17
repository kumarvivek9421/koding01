package forInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class Persion{
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Persion(int id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "persion [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}	
}
public class SortByLastName {
	public static void main(String[] args) {
		List<Persion> persion= Arrays.asList(new Persion(101, "vivek", "kumar", 28),
				new Persion(105, "rahul", "singh", 26),
				new Persion(103, "Shantanu", "jugran", 30),
				new Persion(102, "Ram", "Mishra", 25),
				new Persion(104, "kavita", "chaudhari", 24)
				);
		persion.sort(Comparator.comparing(Persion::getLastName)
				.thenComparing(Persion::getFirstName)
				.thenComparing(Persion::getAge));
		persion.forEach(x->System.out.println(x.getId()+": "+x.getLastName()+": "+x.getFirstName()+": "+x.getAge()));
	}
}
