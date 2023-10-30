import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String studentId = "";
		 String firstName = "";
		 String middleName = "";
		 String lastName = "";
		 String suffix = "";
		 int age = 0;
		 int yearLevel = 0;
		 String phoneNumber = ""; 
		 String email = "";
		 
		 
		Scanner console = new Scanner(System.in);
		
		while(true) {
			//Start Program
			display1();
			int choice = console.nextInt();
			
			//Menu Selection
			if(choice == 1) {
				display2();
				System.out.println("Enter Student ID No. : ");
				studentId = console.next();
				System.out.println("Enter Firstname: ");
				firstName = console.next();
				System.out.println("Enter Middlename: ");
				middleName = console.next();
				System.out.println("Enter Lastname: ");
				lastName = console.next();
				System.out.println("Enter Suffix: ");
				suffix = console.next();
				System.out.println("Enter Age: ");
				age = console.nextInt();
				System.out.println("Enter Year Level: ");
				yearLevel = console.nextInt();
				System.out.println("Enter Phone Number: ");
				phoneNumber = console.next();
				System.out.println("Enter Email: ");
				email = console.next(); 
				
				//
				Student stud = new Student(studentId, firstName, middleName, lastName, suffix, age, yearLevel,phoneNumber,email);
				Course course = new Course();
				course.displayCourse();
				System.out.println("Enter Course: ");
				course.setCourse(console.nextInt());
				
				//
				while(true) {
					display3(stud);
					int select = console.nextInt(); 
					
					if(select == 1) {
						//Update Student
					}
					else if(select == 2) {
						//Update Course
					}
					else if(select == 3) {
						System.out.print(stud.toString(course));
					}
					else if(select == 0) {
						break;
					}
					else
						System.out.println("Invalid!");
					
				}
				
				 
				
			}
			else if(choice == 0) {
				break;
			}
			else {
				System.out.println("Invalid!");
			}
		
		}

	}
	
	protected static void display1() {
		System.out.println("================================\n\n");
		System.out.println("Student Record Management App v1\n");
		System.out.println("Selection Menu: ");
		System.out.print("================================\n1. Create Account\n0. Exit\n================================\n\nEnter Selection: ");
	}
	protected static void display2() {
		System.out.println("================================\n\n");
		System.out.println("Student Record Management App v1\n");
		System.out.println("Enter Student Details: ");
		System.out.print("================================\nStudent ID No. \n================================\n\n");
	}
	protected static void display3(Student stud) {
		
		System.out.println("\n\n================================\n\n");
		System.out.println("Student Record Management App v1\n");
		System.out.println("Student Record Selection Menu: ");
		System.out.print("================================\n1. Update Student"
				+ "Profile Details\n2. Update Student Course Details\n3. Display Student Record\n0. Exit\n================================\n\nEnter Selection: ");
	}


}
