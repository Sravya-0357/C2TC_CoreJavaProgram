package day5.Basics.HierachicalInheritance;

public class Student extends Person {
	private int uid ;
	private String Coursename;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getCoursename() {
		return Coursename;
	}
	public void setCoursename(String coursename) {
		Coursename = coursename;
	}
	public Student(int id, String name, String city, int uid, String coursename) {
		super(id, name, city);
		this.uid = uid;
		Coursename = coursename;
	}
	@Override
	public String toString() {
		return "Student id: " + super.getId() + " Name: " + super.getName() + " City: " + super.getCity()+ "uid=" + uid + ", Coursename=" + Coursename ;
	}
	
	
	
}
