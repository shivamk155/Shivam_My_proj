package comparator.versus.comparable;

import java.util.Comparator;

public class Student implements Comparable<Student>{

	private String name;
	private int age;
	private int marks;

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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	@Override
	public int compareTo(Student o) {
		return (this.getAge() - o.getAge());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + marks;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
			return true;
		
/*		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
*/	}

	public Student(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public static Comparator<Student> nameComparator = new Comparator<Student>(){
		public int compare(Student s1, Student s2){
			return s1.getName().compareTo(s2.getName());	
		} 	
		
	}; 
	
	public static Comparator<Student> ageComparator = new Comparator<Student>(){
		public int compare(Student s1, Student s2){
			return (s1.getAge() - s2.getAge());	
		} 	
		
	}; 

	public static Comparator<Student> marksComparator = new Comparator<Student>(){
		public int compare(Student s1, Student s2){
			return -1*(s1.getMarks() - s2.getMarks());	
		} 	
		
	}; 
}
