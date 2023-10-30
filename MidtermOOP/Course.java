
public class Course {
	private String courseName = "";
	private String courseCode = "";
	private String department = "";
	
	//----------------------------
	
	private static String[] courses = {"Bachelor of Science in Information Technology", "Bachelor of Science in Computer Science",
			"Associate of Computer Technology","Bachelor of Science in Mechanical Engineering",
			"Bachelor of Science in Civil Engineering"};
	private static String[] code = {"BSIT", "BSCS", "ACT", "BSME", "BSCE"};
	private static String[] data = {"College of Computer Studies Department", "College of Engineering Department"};
	 
	
	
	public void displayCourse() {
		System.out.println("Courses");
		int i = 1;
		for(String x : courses) {
			System.out.println(i +". "+x);
			i++;
		}
	}
	public void setCourse(int value) {
		
		if(value > courses.length)
			System.out.print("Invalid!");
		else {
			if(value >=1 || value <= 3) {
				this.courseName = courses[value-1];
				this.courseCode = code[value-1];
				this.department = data[0];
			}
			else if(value >= 4 || value <= 5) {
				this.courseName = courses[value-1];
				this.courseCode = code[value-1];
				this.department = data[1];
			}
		}
	}
	
	public String toString() {
		return "Course Name: " + this.courseName+"\nCourse Code: "+this.courseCode+"\nDepartment: "+this.department;
	}
	
}
