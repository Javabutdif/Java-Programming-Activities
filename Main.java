import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter number:");
		int num = console.nextInt();
			for(int i = 0; i <= num; i++) {
				
				for(int j=0; j <= num; j++) {
					if(i==0 || i == num|| j==0 || j==num) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			
			}
			System.out.println();
		
	}
		
}
