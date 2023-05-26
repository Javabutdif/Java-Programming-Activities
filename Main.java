import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack <String> stack = new Stack<String>();
		
		Name honda = new Name();
		Name ford = new Name();
		Name toyota= new Name();
		
		honda.name = "SpaceX";
		honda.brand = "Honda";
		honda.year = 2022;
		
		toyota.name = "Beach";
		toyota.brand = "Toyota";
		toyota.year = 2021;
		
		ford.name = "JupiterX";
		ford.brand = "Ford";
		ford.year = 2023;
		
		//Stack kay Last in First OUT
		stack.push(honda.getName());//1st
		stack.push(ford.getName());//2nd
		stack.push(toyota.getName());//3rd
		
		for(int i  = 0; i < stack.capacity(); i++) {
			System.out.println(stack.pop());
			System.out.println("===================");
		}
		
		
	}
	

}
