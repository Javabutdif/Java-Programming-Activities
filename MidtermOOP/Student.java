
public class Student {
	private String studentId = "";
	private String firstName = "";
	private String middleName = "";
	private String lastName = "";
	private String suffix = "";
	private int age = 0;
	private int yearLevel = 0;
	private String phoneNumber = "";
	private String email = "";
	
	Student(){
		
	}
	Student(String id, String firstname, String middlename, String lastname, String suffix, int age, int yearLevel,String phoneNumber, String email){
		this.studentId = id;
		this.firstName = firstname;
		this.middleName = middlename;
		this.lastName = lastname; 
		this.suffix = suffix;
		this.age  = age;
		this.yearLevel = yearLevel;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	//Getters
	public String getId() {
		return this.studentId;
	}
	public String getFirst() {
		return this.firstName;
	}
	public String getMid() {
		return this.middleName;
	}
	public String getLast() {
		return this.lastName;
	}
	public String getSuf() {
		return this.suffix;
	}
	public int getAge() {
		return this.age;
	}
	public int getYear() {
		return this.yearLevel;
	}
	public String getPhone() {
		return this.phoneNumber;
	}
	public String getEmail() {
		return this.email;
	}
	//Setters
	
	public void setId(String value) {
		this.studentId = value;
	}
	public void setFirst(String value) {
		this.firstName = value;
	}
	public void setMid(String value) {
		this.middleName = value;
	}
	public void setLast(String value) {
		this.lastName = value;
	}
	public void setSuf(String value) {
		this.suffix = value;
	}
	public void setAge(int value) {
		this.age = value;
	}
	public void setYear(int value) {
		this.yearLevel = value;
	}
	public void setPhone(String value) {
		this.phoneNumber = value;
	}
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String toString(Course course) {
		  
		return "Student ID No: " + this.studentId+"\nFirstName: " + this.firstName+"\nMiddlename: " + this.middleName+"\nLastname: " + this.lastName
				+"\nSuffix: " + this.suffix+"\nAge: " + this.age+"\nYear Level: " + this.yearLevel
				+"\nPhone Number: " + this.phoneNumber +"\nEmail: " + this.email+"\n" + course.toString();
	}
	
}
