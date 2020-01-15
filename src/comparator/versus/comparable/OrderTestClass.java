package comparator.versus.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderTestClass {

	public static void main(String[] args) {
		List<Student> unsortedList = new ArrayList<>();
		
		unsortedList.add(new Student("Ruchi",29,12));
		unsortedList.add(new Student("Rahul",39,2));
		unsortedList.add(new Student("Shivam",30,48));
		unsortedList.add(new Student("Virender",69,80));
		unsortedList.add(new Student("Arun",59,32));
		unsortedList.add(new Student("Shivam",59,62));
		unsortedList.add(new Student("Shivam",119,162));
		
/*		
		System.out.println("After sorting the list is");
		unsortedList.forEach((o) -> System.out.println(o));
		
		Collections.sort(unsortedList);
		System.out.println("After sorting the list is");
		unsortedList.forEach((o)-> System.out.println(o));
		
		
		Collections.sort(unsortedList,Student.nameComparator);
		System.out.println("After sorting the list by the name is");
		unsortedList.forEach((o)-> System.out.println(o));
		
		Collections.sort(unsortedList, new Comparator<Student>(){
			public int compare(Student s1,Student s2){
				return -1*(s1.getMarks()-s2.getMarks());
			}
		});
		
		System.out.println("/n After sorting the list by the Marks is /n");
		unsortedList.sort(Student.marksComparator);
		unsortedList.forEach((o)-> System.out.println(o));
		
	
		System.out.println("/n After sorting the list by the Marks is /n");
		unsortedList.sort((Student s1, Student s2) -> -1*(s1.getMarks() - s2.getMarks()));
		unsortedList.forEach((o)-> System.out.println(o));
		
		System.out.println("/n After sorting the list by the Marks is /n");
		Comparator<Student> marksComparator = (s1,s2) -> (s1.getMarks() - s2.getMarks());
		Comparator<Student> nameComparator = (s1,s2) -> s1.getName().compareTo(s2.getName());
		unsortedList.sort(Comparator.nullsLast(nameComparator).thenComparing(marksComparator));
		unsortedList.forEach((o)-> System.out.println(o));

		System.out.println("/n After sorting the list by the Marks is /n");  
		Comparator<Student> nameComparewithNullHandling = Comparator.comparing(Student::getName, Comparator.nullsFirst(String::compareTo)); 
		Collections.sort(unsortedList,nameComparewithNullHandling);
		unsortedList.forEach(o -> System.out.println(o));
		
		System.out.println("/n After sorting the list by the Marks is /n");
		Comparator<Student> nameComparewithNullHandling2 = Comparator.comparing(Student::getName, Comparator.nullsFirst(String::compareTo)).reversed();
		Collections.sort(unsortedList,nameComparewithNullHandling2);
		unsortedList.forEach(o -> System.out.println(o));


		//unsortedList = unsortedList.stream().filter(o -> o.getName() == "Shivam").filter(o -> o.getAge() == 59).collect(Collectors.toList());
		//unsortedList.forEach(o -> System.out.println(o));
		
		
		String[] arrayOfWords = {"STACK", "OOOVVVER"};
		List<String> testString = Arrays.asList(arrayOfWords);
		
		System.out.println(testString);
		List<String> testStringnew = testString.stream().map(o -> o.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
		
		System.out.println(testStringnew);
		
		//DIfference between Map and Filter
		System.out.println("After starting to start with R");
		unsortedList.stream().filter(x -> x.getName().startsWith("R")).forEach(System.out::println);
		System.out.println("After ending to start with R");
		
		unsortedList.stream().map(x -> x.getName().toUpperCase()).forEach(System.out::println);
*/		
		
		unsortedList.add(new Student("Virender",69,80));
		unsortedList.add(new Student("Arun",59,32));
		unsortedList.add(new Student("Shivam",119,162));
		
		unsortedList.stream().distinct().forEach((o) -> System.out.println(o));
		
	}

}
