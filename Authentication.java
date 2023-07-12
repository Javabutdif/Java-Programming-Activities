import java.util.*;
import javax.swing.*;
public class Authentication{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      Admin admin = new Admin();
      Account student = new Account();
      
      String userInput = "";
      String passInput = "";
      String firstname = "";
      String middlename = "";
      String lastname = "";
      String course = "";
      
      while(true){
      try{
      int choice  = Integer.parseInt(JOptionPane.showInputDialog("Online Enrollment\n[1]Login\n[2]Create Account\n[3]Admin\n[4]Exit"));
      
      if(choice == 1){
    
         userInput = JOptionPane.showInputDialog("Enter username");
         passInput = JOptionPane.showInputDialog("Enter password");
         student.access(userInput,passInput);
         userInput = "";
         passInput = "";
         
      }
      else if(choice == 2){
         //Account Creation
         firstname = JOptionPane.showInputDialog("Enter firstname");
         middlename = JOptionPane.showInputDialog("Enter middlename");
         lastname = JOptionPane.showInputDialog("Enter lastname");
         course = JOptionPane.showInputDialog("Enter course");
         userInput = JOptionPane.showInputDialog("Enter username");
         passInput = JOptionPane.showInputDialog("Enter password");
         new Account(userInput, passInput);
         new Account(firstname, middlename, lastname, course);
         
         userInput = "";
         passInput = "";
         firstname = "";
         middlename = "";
         lastname = "";
         course = "";
          JOptionPane.showMessageDialog(null,"Successful!");


      
      }
      else if(choice  == 3){
      while(userInput.isEmpty() && passInput.isEmpty() && true){
         userInput = JOptionPane.showInputDialog("Enter admin username");
         passInput = JOptionPane.showInputDialog("Enter admin password");
         
         if(userInput.compareTo(admin.getAdmin()) == 0 && passInput.compareTo(admin.getPass()) == 0){
            userInput = "";
            passInput = "";
            break;
            }
         else{
            JOptionPane.showMessageDialog(null,"Error, Please try again!");
            userInput = "";
            passInput = "";
            }
         

         }
         JOptionPane.showMessageDialog(null,"Login");
         
         while(true){
            int choices = Integer.parseInt(JOptionPane.showInputDialog("[1] View Data\n[2]Exit"));
            
            if(choices == 1){
               admin.accessData();
            }
            else if(choices == 2) 
               break;
            else
               JOptionPane.showMessageDialog(null,"Error, Please try again!");


         }
         

         
      
      }
      else if(choice == 4)
         break;
      else
         JOptionPane.showMessageDialog(null,"Error, Please try again!");

     
      
      
      }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Error, Please try again!");
      }
      }
   }

}
class Account{
   private static String registrationId = "";
   private static String studentUser = "";
   private static String studentPass = "";
   private static String firstname = "";
   private static String middlename = "";
   private static String lastname = "";
   private static String idNum = "";
   private static String course = "";
   private static String information = "";
   
   Random rand = new Random();
   private static HashMap <String, String> studentAccount = new HashMap<String, String>();
   private static HashMap <String, String> studentInformation = new HashMap<String, String>();
   Account(){
   
   }
   
   Account(String firstname, String middlename, String lastname,String course){
      
      this.firstname = firstname;
      this.middlename = middlename;
      this.lastname = lastname;
      this.course = course;
      
      setInformation();
   
   }
   Account(String studentUser, String studentPass){
      this.studentUser = studentUser;
      this.studentPass = studentPass;
   }
   public void setInformation(){
      this.information = "First Name: " + this.firstname +"\nMiddle Name: " + this.middlename + "\nLast Name: "+ this.lastname +"\nID Number: #"+getIdNum()+"\nCourse: "+course+"\nStatus: Enrolled";
      studentInformation.put(this.studentUser, this.information);
      studentAccount.put(this.studentUser, this.studentPass);
   }
   public void access(String username , String password){
      if(this.studentAccount.get(username) != null && this.studentAccount.get(username).compareTo(password) == 0)
         JOptionPane.showMessageDialog(null,studentInformation.get(username));
      else
         JOptionPane.showMessageDialog(null,"Invalid Username or Password!");


      
   }
   public void viewStudentData(){
       String display = "";
      
      for(String x : studentInformation.values())
         display += x+"\n\n";
         
       JOptionPane.showMessageDialog(null,display);
   }
   
   
   
   private String getIdNum(){
      String num = "123456789";
      String ref = "";
      
      for(int i = 0; i < 8; i++)
         ref += num.charAt(rand.nextInt(num.length()));
         
       
       return ref;
   }


}
class Admin{
   Account student = new Account();
   private String adminUser = "admin";
   private String adminPass = "admin";
   
   public String getAdmin(){
      return this.adminUser;
   }
   public String getPass(){
      return this.adminPass;
   }
   public void accessData(){
      student.viewStudentData();
   }
   



}
