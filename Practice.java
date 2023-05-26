

import java.util.*;

//Main
public class Practice  {

	public static void main(String[] args) {
		

		new User();

	}

}
//

interface actions{
	void getUser();
	boolean getInfo(int choice);
	void getDisplay();
	void setDeposit();
	void getWithdraw();
	void setData();
}



abstract class Output implements actions{
	
	static Scanner console = new Scanner(System.in);
	private int choice = -1;
	private String username = "";
	private boolean indicator = false;
	private double balance = 100;

	@Override 
	public void setData() {
		
	}
	
	
	Output(){
		System.out.println("Welcome to ATM");
		getUser();
	}

	
	
	public void getUser() {
		
		System.out.println("[1] Log in | [2] Create User | [3] Exit");
		while(true) {
		while(true) {
			System.out.print("Enter: ");
			choice = console.nextInt();
			if(choice == 3)
				break;
			
			if(choice == 1 || choice == 2)
					break;
			

			}
			if(choice == 3) {
				System.out.println("Thank you for using our system!");
			break;
			}
			if(getInfo(choice) == true)
				break;
		}
		//Withdrawal or Deposit
	
		while (true) {
			System.out.println("[1] Display Balance | [2] Deposit | [3] Withdraw | [4] Exit" + "\nEnter: ");
			
			int n = console.nextInt();
			
			if(n == 1)
				getDisplay();
			if(n == 2)
				setDeposit();
			if(n == 3)
				getWithdraw();
			if(n == 4) {
				System.out.println("Thank you for using our system!");
				break;
			}
				
			
		}
		
	
		
			
	}
	
	
	
	public boolean getInfo(int choice) {
		
		if(choice == 1) {
			
			while(!indicator) {
			System.out.print("Enter username: ");
			String getInfo = console.next();
			
			if(!getInfo.equals(username)) {
				System.out.println("User not found");
				System.out.println("Do you want to enter again? [yes] | [no]");
				char get = console.next().charAt(0);
				
				if(get == 'N' || get == 'n' )
					break;
				
				
			}
			else {
				indicator = true;
			}
				
			}
			
		}
		else {
			System.out.println("Create Username: ");
			setUser(console.next());
			System.out.println("Username created");
		}
		return indicator;
	}
	
	void setUser(String user) {
		this.username = user;
	}
	public void getDisplay() {
		System.out.println("Your balance is: " + this.balance);
	}
	public void setDeposit() {
		System.out.println("Enter amount to deposit: ");
		balance += console.nextDouble();
		System.out.println("Sucessful Deposit");
	}
	public void getWithdraw() {
		System.out.println("Enter amount to withdraw: ");
		double check = console.nextDouble();
		if(check > this.balance)
			System.out.println("Withdraw amount exceed from the current balance");
		else {
			this.balance -= check;
			System.out.println("Sucessful Withdraw");
		}
		
	}
	
	
}

class User extends Output{
	
	User(){
		
	}
	
}