package builder.pattern;

public class BuilderUser {

	public static void main(String[] args) {
		EmployeeBuilder emp = new EmployeeBuilder.Builder()
				.setEmpId(1)
				.setEmpAddress("adddress")
				.build();
	}

}
