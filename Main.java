import java.util.*;
import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		
		while(true) {
		int choice = Integer.parseInt(JOptionPane.showInputDialog("[1] Add Enrolees, [2] Delete Enrolees"));
		
		if(choice ==1) {
			displayAdd();
		}
		else if(choice ==2)
			deleteStudent();
		else if(choice == 3)
			show();
		}

	}
	private static void displayAdd() {
		String lastname = "";;
		String firstname = "";
		String middlename = "";
		int age = 0;
		String course = "";
		lastname = JOptionPane.showInputDialog("Input Last Name");
		firstname = JOptionPane.showInputDialog("Input First Name");
		middlename = JOptionPane.showInputDialog("Input Middle Name");
		age = Integer.parseInt(JOptionPane.showInputDialog("Input Age"));
		course = JOptionPane.showInputDialog("Input Course");
		
		Student stud = new Student(lastname, firstname, middlename, age, course);
		stud.addStudent();

	}
	private static void deleteStudent() {
		String lastname = JOptionPane.showInputDialog("Input Last Name to Delete");
		new Student(lastname);
		
	}
	private static void show() {
		Student stud1 = new Student();
		stud1.showStudent();
	}

}
