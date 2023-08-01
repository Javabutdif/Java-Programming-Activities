import java.util.Scanner;

public class PalendromeInt {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = console.nextInt();
        
        System.out.println(isPalendrome(num));
    }
    public static boolean isPalendrome(int num){
        
        String number = String.valueOf(num);
        StringBuffer b = new StringBuffer(number);
        b.reverse();
        
        return number.compareTo(b.toString())== 0 ? true : false;
    }
    
}
/*
Documentation for the given code:

The code provided is a Java program to check if a given number is a palindrome or not.

1. The code begins with importing the `java.util.Scanner` class, which is used to take input from the user.

2. The PalendromeInt class is declared, which is the main class of the program.

3. Inside the PalendromeInt class, the main method is defined. This is the entry point of the program.

4. The Scanner object named console is created to read input from the user.

5. The program prompts the user to enter a number by displaying the message "Enter Num: ".

6. The entered number is read using the nextInt() method of the Scanner class and stored in the variable num.

7. The isPalendrome method is called with the num as an argument, and the result is printed using System.out.println().

8. The isPalendrome method is defined outside the main method. It takes an integer num as a parameter and returns a boolean value indicating whether the number is a palindrome or not.

9. Inside the isPalendrome method, the num is converted to a string using the String.valueOf() method and stored in the variable number.

10. A StringBuffer object named b is created with the number as an argument. The StringBuffer class provides methods to manipulate strings.

11. The reverse() method of the StringBuffer class is called on the b object to reverse the string.

12. The reversed string is then compared with the original string using the compareTo() method. If the two strings are equal, the method returns 0, indicating that the number is a palindrome. Otherwise, it returns a non-zero value.

13. The result of the comparison is then checked using the ternary operator ? :. If the result is 0, the method returns true, indicating that the number is a palindrome. Otherwise, it returns false.

14. Finally, the main method ends and the program terminates.

In summary, the given code prompts the user to enter a number, checks if the number is a palindrome using the isPalendrome method, and prints the result.



*/