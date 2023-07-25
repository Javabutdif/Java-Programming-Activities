import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Main main = new Main();
		
		while(true) {
		System.out.print("Input Date\nFormat: mm/dd/yyyy\n\nInput: ");
		String input = console.next();
		
		String[] dateTime = input.split("/");
		
		int month = Integer.parseInt(dateTime[0]);
		int day = Integer.parseInt(dateTime[1]);
		int year = Integer.parseInt(dateTime[2]);
		
		
		
		String monthOut = "";
		
		switch (month) {
		case 1 -> monthOut = "January";
		case 2 -> monthOut = "February";
		case 3 -> monthOut = "March";
		case 4 -> monthOut = "April";
		case 5 -> monthOut = "May";
		case 6 -> monthOut = "June";
		case 7 -> monthOut = "July";
		case 8 -> monthOut = "August";
		case 9 -> monthOut = "September";
		case 10 -> monthOut = "October";
		case 11 -> monthOut = "November";
		case 12 -> monthOut = "December";
		
		}
		
		
		System.out.println("Date: " + monthOut +" "+day+", " + year+"\n"+ main.leapYear(year)+"\n");
		}
		
		
	}
	
	public String leapYear(int year) {
		return year%4 == 0 ? "Leap Year" : "Not Leap Year";
	}

}
