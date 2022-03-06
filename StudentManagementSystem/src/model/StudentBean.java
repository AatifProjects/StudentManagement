package model;

public class StudentBean {
	private String rollNum;
	private String name;
	private String grade;
	private String section;
	private String gender;
	
		
	
	public String getRollNum() {
		return rollNum;
	}
	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "StudentBean [rollNum=" + rollNum + ", name=" + name + ", grade=" + grade + ", section=" + section
				+ ", gender=" + gender + "]";
	}
	
	
	
			

}
