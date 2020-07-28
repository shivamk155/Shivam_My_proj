package immutable.obj;

import java.sql.Date;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestImmutable {

    public static void main(String[] args) {
		Date date = new Date(119,9,28);

        School a = new School(1, 1);
        School b = new School(5, 5);
        School c = new School(10, 10);
        School d = new School(100, 100);
        School e = new School(20, 20);

        School f = new School(5, 6);
		School g = new School(50, 60);

        List<School> schoolList = new ArrayList<>();
        schoolList.add(a);
        schoolList.add(b);
        schoolList.add(c);
        schoolList.add(d);
        schoolList.add(e);
        schoolList.add(f);

		Student s = new Student(date, schoolList);

		System.out.println(s.getDate());
		s.getDate().setDate(29);
		System.out.println(s.getDate());
		date.setDate(29);
		System.out.println(s.getDate());

		//Playing with the list now
        System.out.println(schoolList);
		System.out.println(s.getSchoolList());

		//s.getSchoolList().add(g); //This will throw exception
		schoolList.add(g);
		schoolList.get(0).setAge(10000);
		s.getSchoolList().get(0).setAge(100000);

        System.out.println(schoolList);
        System.out.println(s.getSchoolList());

//        //toMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction, Supplier mapSupplier);
//        TreeMap<Integer, School> treeMap = new TreeMap<>(Collections.reverseOrder());
//
//        Map<Integer, School> schoolMap = schoolList.stream()
//                .filter(x -> x.getAge() < 10)
//                .collect(Collectors.toMap(School::getId,Function.identity(), (x,y) -> y, TreeMap::new));
//
//        //this can also been used .collect(Collectors.toMap(School::getId,s -> s));
//        //Check the difference between (x,y) -> x or -> y,,,,(existing, replacement) -> existing
//
//        schoolMap.forEach((x, y) -> System.out.println(x + ", " + y));
    }
}