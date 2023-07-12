import java.util.Scanner;

public class Authentication{
   public static void main(String[] args){
   
   
   acceptInputs();
      
   }
   
   public static void acceptInputs(){
      Scanner console = new Scanner(System.in);
      String accountN = "";
      String accountP = "";
      int counter = 0;
      char verifier = 'a';
      int regis = 0;
      
     
      //Instantiate
      Account acc = new Account();
     while(verifier != 'N'){ 
      System.out.println("Welcome to the Bank Account!");
      System.out.println("Press R if you want to Register or L if you want to Login");
      String choice = console.next().toLowerCase();
      
      if(choice.charAt(0) == 'r'){
         System.out.println("================================");
         System.out.print("Enter your Account Name: ");
         acc.newAccount1 = console.next();
         System.out.print("Enter your Account Pass: ");
         acc.newPass1 = console.next();
         System.out.println("================================");
         
        
         System.out.println(acc.newAccount1 != null && acc.newPass1 != null ? "Confirmed!" : "Please try again!");
         System.out.println("Would you like to transact again? Y or N ");
         char veri = console.next().charAt(0);
         verifier = veri == 'Y' || veri == 'y' ? 'Y' : 'N';
         regis++;
         System.out.println("================================");
      }
      else{
      
      if(regis == 1){
       do{
        System.out.println("================================");
         System.out.print("Please enter your Account Name: ");
         accountN = console.next();
         System.out.print("Please enter your Account Password: ");
         accountP = console.next();
         System.out.println("================================");
         counter = accountN.compareTo(acc.newAccount1) == 0 && accountP.compareTo(acc.newPass1) == 0 ? counter + 1 : 0; 
         System.out.println(counter == 0 ? "Error! Please try again!" : "Confirmed!");
      }while(counter != 1 );
         break;
      }
      else{
      
      //
      do{
        System.out.println("================================");
         System.out.print("Please enter your Account Name: ");
         accountN = console.next();
         System.out.print("Please enter your Account Password: ");
         accountP = console.next();
         System.out.println("================================");
         counter = accountN.compareTo(acc.accountName) == 0 && accountP.compareTo(acc.accountPass) == 0 ? counter + 1 : 0; 
         System.out.println(counter == 0 ? "Error! Please try again!" : "Confirmed!");
      }while(counter != 1 );
       break;
      
      }
      }
      }
      
   }
   
   
}

class Account{
   
   protected String accountName = "james123";
   protected String accountPass = "123";
   
   protected String newAccount1 = "";
   protected String newPass1 = "";
   
   
}