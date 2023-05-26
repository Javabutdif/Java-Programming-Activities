import java.util.LinkedList;
import java.util.Scanner;

public class Linked {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		LinkedList<String> countries = new LinkedList<String>();
		
		int counter = 0;
		int index =0;
		String place = "";
		int choice = 0;
		
		System.out.println("[1] Add Country, [2]Get Country,[3] Set Country, [4] Remove Country, [5]Display Country,[6] Exit");
		
		while(counter != 1) {
	try {
		System.out.print("Enter choice: ");
		choice = console.nextInt();
		
		switch(choice) {
		
		case 1 : System.out.print("Add Country: ");
				countries.offer(console.next());

			break;
			
		case 2 : System.out.print("Enter index: ");
				index = console.nextInt();
				
				if(countries.isEmpty())System.out.println("Error! LinkedList is Empty");
				else if(index > countries.size())System.out.println("Error! Index Out of Bounds");
				else System.out.println(countries.get(index));
			break;
		
		case 3 : System.out.print("Enter index: ");
				index = console.nextInt();
			
				if(countries.isEmpty())System.out.println("Error! LinkedList is Empty");
				else if(index > countries.size())System.out.println("Error! Index Out of Bounds");
				else {
					System.out.print("Enter a Country to Insert: ");
					countries.set(index, console.next());
				}
			
			break;
		
		case 4 : System.out.print("Enter a Country that you want to remove: ");
				place = console.next();
				
				if(countries.contains(place)) countries.remove(place);
				else System.out.println("No Element");
			break;
			
		case 5 : if(countries.isEmpty())System.out.println("Display: Empty");
				else System.out.println("Display: " + countries);
			
			break;
			
		case 6 : System.out.println("Confirm Exit? [1] YES , [0] NO");
				counter = (int) (console.nextInt() == 1 ? 1 : 0);
			break;
			
		default : System.out.println("Please enter a specific Number!");
			
			break;
		
		}
	}catch(Exception e) {
		System.out.println("Invalid Response!");
		break;
	}
		
		}

	}

}
