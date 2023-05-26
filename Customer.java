import java.util.LinkedList;
import java.util.Queue;
public class Customer {
	
	static Queue<String> customer = new LinkedList<>();
	
	static Queue<String> getCustomer() {
		
		customer.offer("Karen");
		customer.offer("Brandon");
		customer.offer("Kyle");
		customer.offer("Jude");
		customer.offer("Oliver");
		customer.offer("Rennel");
		
		return customer;
	}

}
