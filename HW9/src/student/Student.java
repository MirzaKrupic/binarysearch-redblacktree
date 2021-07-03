package student;

public class Student {
	private int studentId, yearOfEnrolment;
	private String fullName, dob, universityName, departmentCode, departmentName;
	
	public Student(int studentId, int yearOfEnrolment, String fullName, String dob, String universityName,
			String departmentCode, String departmentName) {
		this.studentId = studentId;
		this.yearOfEnrolment = yearOfEnrolment;
		this.fullName = fullName;
		this.dob = dob;
		this.universityName = universityName;
		this.departmentCode = departmentCode;
		this.departmentName = departmentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getYearOfEnrolment() {
		return yearOfEnrolment;
	}

	public void setYearOfEnrolment(int yearOfEnrolment) {
		this.yearOfEnrolment = yearOfEnrolment;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
