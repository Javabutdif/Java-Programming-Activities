import java.util.Stack;

public class Stacking {

	static Stack<Integer> stack = new Stack<Integer>();
	
	public static void main(String[] args) {
		
		stacks();

	}
	
	public static void stacks() {
		
		int[] num = {1,2,3,4,5,6,7,8,9,0};
		
		for(int x : num)
			stack.push(x);
		
		for(int x : stack)
			System.out.println(x);
	}

}
