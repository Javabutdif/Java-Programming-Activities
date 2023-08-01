import java.util.*;
public class CashDispenser {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Cash cash = new Cash();
        while(true){
             cash.display();
            int money= console.nextInt();
            
            if(money>0){
                new Cash(money);
                cash.viewData();
                cash.Reset();
            }
            else break;
            
        }
    }
    
}

class Cash{
    private static int  oneThousand = 5;
    private static int fiveHundred = 5;
    private static int twoHundred=5;
    private static int oneHundred = 5;
    private static  int tenCoins = 5;
    private static String outputDisplay= "";
    private static  int money = 0;
    private static  int counter1k = 0;
    private static  int counter5 = 0;
    private static int counter2 = 0;
    private static int counter1 = 0;
    private static int counter10= 0;
    private static boolean ind = false;
    
    Cash(){
        
    }
    Cash(int money){
        this.money = money;
        computeMoney();
        
    }
    
    public void display(){
        System.out.print("Cash Dispenser\nCash\tQuantity\n1000\t["+oneThousand+"]\n500\t["+fiveHundred+"]\n200\t["+twoHundred+"]\n100\t["+oneHundred+"]\n10\t["+tenCoins+"]\n\nInput: ");
    }
    public void computeMoney(){
        while(money!=0){
        if(money >= 1000 && oneThousand != 0 && money/1000 <= oneThousand){
            money-= 1000;
            oneThousand-= 1;
            counter1k++;
            
        }
        else if(money>= 500 && fiveHundred != 0 && money/500 <= fiveHundred){
            money-= 500;
            fiveHundred-=1;
            counter5++;
        }
            else if(money>= 200 && twoHundred != 0 && money/200<=twoHundred){
            money-= 200;
            twoHundred-=1;
            counter2++;
        }
            else if(money>= 100 && oneHundred != 0 && money/100<=oneHundred){
            money-= 100;
            oneHundred-=1;
            counter1++;
        }
            else if(money>= 10 && tenCoins != 0&& money/10<= tenCoins){
            money-= 10;
            tenCoins-=1;
            counter10++;
        }
            else{
                System.out.println("Not enough money to dispense");
                
                ind = true;
                break;
            }
        }
        while(true){
            if(ind == true){
                break;
            }
            
            else if(counter1k>0){
                outputDisplay+= "1000 *"+ counter1k+"= "+ (1000*counter1k)+ "\n";
                counter1k = 0;
            }
            else if(counter5 > 0){
                outputDisplay+= "500 *"+ counter5+"= "+ (500*counter5)+ "\n"; counter5=0;}
                else if(counter2 > 0){
                outputDisplay+= "200 *"+ counter2+"= "+ (200*counter2)+ "\n";counter2=0;}
                else if(counter1 > 0){
                outputDisplay+= "100 *"+ counter1+"= "+ (100*counter1)+ "\n";counter1= 0;}
                else if(counter10 > 0){
                outputDisplay+= "10 *"+ counter10+"= "+ (10*counter10)+ "\n";counter10= 0;}
                    else break;
                
        }
    }
    
    public void viewData(){
        System.out.println("Output: \n"+ outputDisplay);
    }
    public void Reset(){
        outputDisplay= "";
        ind= false;
    }
}