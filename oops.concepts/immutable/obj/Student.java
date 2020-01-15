package immutable.obj;

import java.sql.Date;

public final class Student {
	
	final private Date date;
	
	public Student(Date date) {
		this.date = new Date(date.getTime());
	}

	public Date getDate() {
		return new Date(date.getTime());
	}
}