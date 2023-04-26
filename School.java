import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;

public abstract class School implements Enrollment_Method {
	
	private String lastName = "";
	private String firstName = "";
	private String middleName = "";
	private int age = 0;
	private String course = "";
	private String id = "";
	School(){
		
	}
	
	
	School(String lastName, String firstName, String middleName, int age, String course){
	
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.age = age;
		this.course = course;
	}
	School(String name){
		deleteStudent(name);
	}
	
	public String getID() {
		Random rand = new Random();
		int i = 0;
		String reference = "";
		while(i < 10) {
			reference+= rand.nextInt(9);
			i++;
		}
		
		return reference;
		
	}
	
	String path= "D:Student\\";
	
	File folder = new File(path);
	
	
	
	
	public void addStudent() {
		try {
			folder.mkdir();
			
			File file = new File(path+lastName+".txt");
			file.createNewFile();
			FileWriter write = new FileWriter(path+lastName+".txt");
			write.write(getID()+","+lastName+","+firstName+","+middleName+","+age+","+course);
			write.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public void deleteStudent(String name) {
		File del = new File(path+name+".txt");
		if(del.exists()) {
			del.delete();
			JOptionPane.showMessageDialog(null, "Student Deleted");
		}
		else
			JOptionPane.showMessageDialog(null, "No Student Record");
	}
	public void showStudent() {
		File retrieve =new File(path);
		String[] re = retrieve.list();
		
		JOptionPane.showMessageDialog(null, re);
	}

}
