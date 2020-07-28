package immutable.obj;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class Student {

    final private Date date;
    final List<School> schoolList;

    public Student(Date date, List<School> list) {
        this.date = new Date(date.getTime());
        List<School> newList = new ArrayList<School>();

        list.stream().forEach(x -> {
            newList.add(new School(x.getAge(), x.getId()));
        });

        this.schoolList = Collections.unmodifiableList(newList);
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    public List<School> getSchoolList() {
		List<School> newList = new ArrayList<School>();
         schoolList.stream().forEach(x -> {
			newList.add(new School(x.getAge(), x.getId()));
		});

         return newList;
	}

}