package immutable.obj;

import java.sql.Date;

public class TestImmutable {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d = new Date(119,9,28);
		Student s = new Student(d);
		
		System.out.println(s.getDate());
		
		s.getDate().setDate(29);
		
		System.out.println(s.getDate());
		
		d.setDate(29);
		
		System.out.println(s.getDate());
		
	}

}
