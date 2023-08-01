import java.util.*;

public class Generator {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        char[] array = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String out = "";
        int counter = 0;
        System.out.print("Input: ");
        String name = console.next().toLowerCase();
        
        while(counter!= name.length()){
            try{
            Thread.sleep(1000);
                char temp = array[rand.nextInt(array.length-1)];
                
                if(temp== name.charAt(counter)){
                    out+= temp;
                    counter++;
                    if(counter == name.length()){
                        System.out.println(out);
                    }
            }
            else
                System.out.println(out+temp);
        }
    catch(Exception e ){
            
        }
        }
        
    }
    
    
    
}