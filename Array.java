import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		
		int[] arrayNumbers = new int[10];
		
		for(int i = 0; i < arrayNumbers.length; i++) {
			System.out.print("Enter grades [" + i + "] : ");
			arrayNumbers[i] = console.nextInt();
		}
		console.close();
		
		getAverage(arrayNumbers);
		getMax(arrayNumbers);
		getMin(arrayNumbers);
		getDisplay(arrayNumbers);
		

	}
	
	public static void getAverage(int[] myArray) {
		double ave = 0;
		for(int j = 0; j < myArray.length; j++) {
			ave = ave + myArray[j];

		}
		ave = ave /myArray.length;
		
		System.out.println("The average is: " + ave);
	}
	
	public static void getMax(int[] myArray){
		int max = 0;
		
		for(int i = 0; i < myArray.length; i ++) {
			if(myArray[i] > max) {
				max = myArray[i];
			}
			
		}
		System.out.println("The highest grade is: " + max);
	}
	public static void getMin(int[] myArray) {
		int min = myArray[0];
		
		for(int i = 0; i < myArray.length; i++) {
			
			if(myArray[i] < min) {
				min = myArray[i];
			}
		}
		System.out.println("The lowest grade is: " + min);
	}
	
	public static void getDisplay(int[] myArray) {
		
		for(int x = 0; x < myArray.length; x++) {
			System.out.println("Grade [" + x + "] : " + myArray[x]);
		}
	}

}
