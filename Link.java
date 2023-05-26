
import java.util.LinkedList;
import java.util.Scanner;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		Scanner console = new Scanner(System.in);
		int counter = 0;
		int get = 0;
		String country = "";
		
		
		do {
			try {
		System.out.println("[1] Add Country, [2]Get Country,[3] Set Country, [4] Remove Country, [5]Display Country,[6] Exit");
		System.out.print("Enter choice: ");
		int choice = console.nextInt();
		
		switch(choice) {
		
		case 1 :
			System.out.print("Enter a Country: ");
			ll.offer(console.next());
			choice =0;
			break;
			
		case 2 :
			System.out.print("Enter an Index: ");
			get = console.nextInt();
			for(int i = 0; i < ll.size(); i++) {
				if(ll.indexOf(get) > ll.size()) {
				System.out.println( "No Element");
				}
			
				else {
					System.out.println(ll.get(get));
					break;
					
				}
			}
			
			break;
		case 3 :
			System.out.print("Enter an Index: ");
			get = console.nextInt();
			for(int i = 0; i < ll.size(); i++) {
			if(ll.indexOf(get) < ll.size()) {
				System.out.print("Enter the Name of the Country you want to Set: ");
				country = console.next();
				ll.set(get, country);
				
				break;
			}
			else {
				System.out.println("Error! No Element");
				
			}
			}
		break;
		case 4 :
			System.out.print("Enter a Country that you want to remove: ");
			country = console.next();
			
			if(ll.contains(country)) {
				ll.remove(country);
				
				choice =0;
			}
			else {
				System.out.println("No Element");
			
			}
				
			
			
		break;
		case 5 :
			if(ll.isEmpty())
			System.out.println("Display: Empty");
			choice =0;
		break;
		case 6 :
			System.out.print("Confirm to Exit [1] for Yes or [0] for No: ");
			int veri = console.nextInt();
			counter = (int) (veri == 1 ?  1 : 0);
		break;
		
			
		}
		
			}catch(Exception e) {
				System.out.println("Error! Please Enter Again ");
			}
		
			
	}while(counter != 1);
		
		
		
	
		
	}
}
