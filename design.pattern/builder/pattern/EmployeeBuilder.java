package builder.pattern;

public class EmployeeBuilder {

	private int empId;
	private String empFirstName;
	private String empLastName;
	private String empAddress;

	public static class Builder {
		private int empId;
		private String empFirstName;
		private String empLastName;
		private String empAddress;

		public Builder setEmpId(int id) {
			this.empId = id;
			return this;
		}

		public Builder setEmpLasName(String empLastName) {
			this.empLastName = empLastName;
			return this;
		}

		public Builder setEmpfirstName(String empFirstName) {
			this.empFirstName = empFirstName;
			return this;
		}

		public Builder setEmpAddress(String empAddress) {
			this.empAddress = empAddress;
			return this;
		}

		public EmployeeBuilder build() {
			return new EmployeeBuilder(this);

		}
	}

	private EmployeeBuilder(Builder builder) {
		this.empId = builder.empId;
		this.empFirstName = builder.empFirstName;
		this.empLastName = builder.empLastName;
		this.empAddress = builder.empAddress;

	}
}
