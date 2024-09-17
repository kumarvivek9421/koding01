package forInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student{
	int studentId;
	String studentName;
	
	@Override
	public int hashCode() {
		return Objects.hash(studentId, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}
}
public class HashCode_EqualMethod {
	public static void main(String[] args) {
		Student s1= new Student();
		s1.studentId= 101;
		s1.studentName= "soni";
		
		Student s2= new Student();
		s2.studentId= 101;
		s2.studentName= "soni";
		
		Map<Student, String>map= new HashMap<>();
		map.put(s1, "student1");
		map.put(s2, "student2");
		
		System.out.println(map);
		System.out.println(s1.equals(s2));
	}
}
