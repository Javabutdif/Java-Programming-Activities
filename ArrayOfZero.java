
public class ArrayOfZero{
   public static void main(String[] args){
   ArrayOfZero array = new ArrayOfZero();
   
   int[] arr = {1,0,0,2,6,1,7,4,0};
   
   array.Sorting(arr);
   
   }
   private void Sorting(int[] arr){
      int zeroLength = 0;
      int numLength = 0;
      
      for(int i =0; i < arr.length; i++){
         if(arr[i] == 0)
            zeroLength++;
         else
            numLength++;
            
            for(int j =0; j < arr.length; j++){
               if(arr[i] < arr[j]){
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
               }
            }
      }
      //End of Loop
      int[] zero = new int[zeroLength];
      int[] num = new int[numLength];
      int numCount = 0;
      int zeroCount = 0;
      
      for(int i =0; i < arr.length; i++){
         if(arr[i] != 0){
            num[numCount] = arr[i];
            numCount++;
         }
         else{
            zero[zeroCount] = arr[i];
            zeroCount++;
         }
            
      }
      
      int[] FinalArray = new int [numLength+zeroLength];
      
      for(int i = 0; i < num.length;i++){
         FinalArray[i] = num[i];
      
      }
      for(int i = num.length; i < FinalArray.length; i++){
         FinalArray[i] = zero[i-num.length];
      }
      
      
      for(int x : FinalArray)
         System.out.print(x + " ");
      
      
   }
}