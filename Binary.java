
import java.util.Scanner;
public class Binary{
   public static void main(String[] args){
   
   Scanner console = new Scanner(System.in);
   
   int[] num = {0};
   
   while(true){
   System.out.print("Insert Number: ");
   int target = console.nextInt();
   
   boolean found = false;
      for(int n : num) 
         if(n == target) found = true;
         if(found)continue;
   
   //Binary Search
   int low = 0;
   int high = num.length -1;
   int mid = -1;
   
   while(low <= high){
      mid = low + (high - low) /2;
      int val = num[mid];
      
      if(val < target) low = mid+1;
      else if(val > target) high = mid -1;
      else break;
   }
   
   //Condition whether the insert number is greater than the last index
   if(num[mid] < target)mid++;
   
   int[] newArr = new int[num.length+1];
   
   for(int i =0; i < newArr.length; i++){
      if(i < mid) newArr[i] = num[i];
      else if(i == mid) newArr[i] = target;
      else newArr[i] = num[i-1];
      }
      for(int x : newArr)
         System.out.print(x + ", ");
         
      num =newArr;
      System.out.println();
   
   }
   }
}