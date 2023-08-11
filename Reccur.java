import java.util.*;
public class Reccur {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        char[] array = new char[10];
        
        //Input
        
        for(int i= 0; i< array.length;i++){
            System.out.print("Input ["+i+"] : ");
            array[i] = console.next().charAt(0);
            
        }
        int numSize = 0;
        int letterSize = 0;
        //Count Size
        
        for(int i = 0; i < array.length;i++){
            
            if(Character.isDigit(array[i]))
                numSize++;
            else 
                letterSize++;
        }
        char[] num = new char[numSize];
        char[] letter = new char[letterSize];
        
        //Counter
        int numCount = 0;
        int letterCount = 0;
        
        
        //Distributing 
        
        for(int i = 0; i < array.length;i++){
            
            if(Character.isDigit(array[i])){
                num[numCount] = array[i];
                numCount++;
            }
            
            else {
                letter[letterCount] = array[i];
                letterCount++;
            }
                
        }
        //Sorting
        
        for(int i = 0; i < num.length;i++){
            for(int j = 0; j< num.length;j++){
                if(num[i]< num[j]){
                    char temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(int i = 0; i < letter.length;i++){
            for(int j = 0; j< letter.length;j++){
                if(letter[i]< letter[j]){
                    char temp = letter[i];
                    letter[i] = letter[j];
                    letter[j] = temp;
                }
            }
        }
        
        //Out of Sort
        //Merging
        
        char[] output = new char[numSize+letterSize];
        
        for(int i = 0; i < letter.length;i++)
             output[i] = letter[i];
        
        for(int i = 0; i< num.length;i++)
             output[letterSize+i] = num[i];
        
        
        for(char x : output)
            System.out.print(x +" ");
    }
    
    
    
}