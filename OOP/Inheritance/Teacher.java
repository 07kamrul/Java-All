package Inheritance;

public class Teacher {
	private String designation = "Teacher";
	private String collegeName = "Beginnersbook";

	public String getDesignation() {
		return designation;
	}

	protected void setDesignation(String designation) {
		this.designation = designation;
	}

	protected String getCollegeName() {
		return collegeName;
	}

	protected void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	void does() {
		System.out.println("Teaching");
	}
}
