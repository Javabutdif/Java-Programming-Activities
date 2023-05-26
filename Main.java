import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

//Linked List plus Queue
public class Main {
	//Global Declaration
	
	
	static LinkedList<String> books = new LinkedList<String>();
	static Stack<String> stack = new Stack<String>();
	static Queue<String> customer = new LinkedList<String>();
	static Random rand = new Random();
	static Libraries lib = new Libraries();
	

	public static void main(String[] args) throws InterruptedException {
		
		
		int counter = 0;
		double money = 0;
		String customers = "";
		String currentBook = "";
		String[] recordBook = new String[8];
		getCustomers();
		allBooks();
		
		display();
		System.out.println();
		
		System.out.println("All Books: " + books);
		System.out.println("==============================");
	
	
		int index = 0;
		
		do {
			Thread.sleep(2000);
			customers = customer.poll();
			currentBook = arrayBooks();
			System.out.println( customers + " want [" + currentBook +"]" );
			if(books.contains(currentBook)) {
				System.out.println(customers + " bought [" + currentBook+"]");
				books.remove(currentBook);
				stack.push(customers);
				index++;
				money += 10.5;
			}
			else {
				System.out.println(customers + " didn't buy the book[ " + currentBook +" ] because it's not available ");
			}
			System.out.println("==============================");
			counter++;
			
		}while(counter < 8);
		
		System.out.println("Customer who have purchased");
		for(int x = 0; x < index; x++) {
			System.out.println(stack.pop());
		}
		
		System.out.println();
		System.out.println("Total Income: " + money);

	}
	public static void display() {
		System.out.println("Welcome to the Library!");
	}
	public static String arrayBooks() {
		
		String[] arrays = {"Maria Clara Version 1", "Brandon Life Habits","Kyle Tragic Stories","Jude Ketchup Mayonnaise"
					, "Dione Life" , "ArachMage Bond"};
		
		
		return arrays[rand.nextInt(arrays.length)];
	}
	
	public static void allBooks() {
		books.addAll(Libraries.getLibraries());
		
	}
	public static void getCustomers() {
		customer.addAll(Customer.getCustomer());
		
	}
	
	
	

}
