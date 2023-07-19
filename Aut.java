import java.util.*;


public class Aut {
    
    public static void main(String[] args) {
        Aut a = new Aut();
        Scanner console = new Scanner(System.in);
       HashMap<String, String> account = new HashMap<String,String>();
        Person stud = new Person();
        String username = "";
        String password = "";
        String firstname = "";
        String lastname = "";
        String section = "";
        while(true){
        
        System.out.print("Welcome to the Server!\n[1] Log in [2] Register [3] View All\nInput: ");
        int choice = console.nextInt();
        
        if(choice == 1){
            System.out.print("Enter username: ");
            username = console.next();
            System.out.print("Enter password: ");
            password = console.next();
            
            
            if(account.get(username)!= null &&account.get(username).compareTo(password) == 0){
                stud.set(username);
                while(true){
                System.out.print("Welcome user! "+username+"\n[1]View Data  [2]Edit Data\nInput: ");
                int pick = console.nextInt();
                
                if(pick== 1)
                 stud.view(username);
                else if(pick == 2){
                    System.out.print("Edit\n[1]Firstname  [2] Lastname\nInput: ");
                    int editChoice = console.nextInt();
                     
                if(editChoice == 1){
                    System.out.print("Enter new firstname: ");
                    String newName = console.next();
                    stud.editFirst(newName);
                }
                else{
                    System.out.print("Enter new lastname: ");
                    String newLast = console.next();
                    stud.editLast(newLast);
                }
                }
                    else{
                        System.out.println("\n\n");
                        break;
                        
                    }
                    
                }
            }
                
            else
                System.out.println("Invalid Login!\n");
            
        }
            else if(choice == 2){
                System.out.print("Enter username: ");
             username = console.next();
            System.out.print("Enter password: ");
            password = console.next();
            System.out.print("Enter firstname: ");
            firstname = console.next();
            System.out.print("Enter lastname: ");
            lastname = console.next();
            System.out.print("Enter Section: ");
            section = console.next();
            
            
            
            account.put(username,password);
            System.out.println("Sucessful!\n");
            
            new Person(firstname,lastname,a.getId(),username,section);
            }
            else if(choice == 3)
                stud.viewAll();
            else
                break;
        
        
            
        }
    }
    
    private String getId(){
        Random rand = new Random();
        String num = "123456789";
        String ref = "";
        
        for(int i = 0; i < 9 ; i++)
           ref+= num.charAt(rand.nextInt(num.length()));
        
        return ref;
    }
    
}

class Student{
    private   String firstname ="";
    private  String lastname ="";
    private  String idNum ="";
    private  String ref ="";
    private   String section ="";
    
    
    
    
      Student(){
    }
    
    Student(String f, String l, String n,String ref, String sec){
        this.firstname =f;
        this.lastname = l;
        this.idNum = n;
        this.ref = ref;
        this.section = sec;
        
    }
    
    public String getF(){
        return this.firstname;
    }
    public String getL(){
        return this.lastname;
    }
    public String getN(){
        return this.idNum;
    }
    public String getR(){
        return this.ref;
    }
    public String getS(){
        return this.section;
    }
    
    
    
    
    
}

class Person{
    static HashMap<String, Student> data = new HashMap<String, Student>();
    
    private static String username = "";
    private   String firstname ="";
    private  String lastname ="";
    private  String idNum ="";
    private  String ref ="";
    private   String section ="";
    
    Person(){}
    Person(String f,String l, String n, String ref, String sec){
        Student s = new Student(f,l,n,ref,sec);
        data.put(ref,s);
        
    }
    public void refresh(){
        this.username = "";
    }
    public void set(String username){
        this.username = username;
    }
    
    public void view(String username){
        
        this.username = username;
        Student x = data.get(username);
            
            System.out.println("Firstname: "+ x.getF() +"\nLastname: "+ x.getL() +"\nID Num: "+ x.getN() +"\nRef: "+ x.getR()+"\nSection: "+x.getS()+"\n\n");
                
    }
    
    public void editFirst(String name){
        
        Student x = data.get(this.username);
        
        this.lastname = x.getL();
        this.idNum = x.getN();
        this.ref = x.getR();
        this.section = x.getS();
        
        new Person(name, this.lastname,this.idNum,this.ref,this.section);
        
        refresh();
    }
    public void editLast(String name){
        
        Student x = data.get(this.username);
        
        this.firstname = x.getF();
        this.idNum = x.getN();
        this.ref = x.getR();
        this.section = x.getS();
        
        new Person(this.firstname, name,this.idNum,this.ref,this.section);
        
        refresh();
    }
    public void viewAll(){
        if(data.isEmpty())
            System.out.println("No Data\n");
        else{
        System.out.println("\n[All Registered]");
            for(Student x : data.values()){
                System.out.println("Firstname: "+ x.getF() +"\nLastname: "+ x.getL() +"\nID Num: "+ x.getN() +"\nRef: "+ x.getR()+"\nSection: "+x.getS()+"\n\n");
                
            }
        }
    }
   
    
}