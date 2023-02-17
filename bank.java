
    
// WAP to design a class account using the inheritance and static that show all function 
// of bank(withrowal,deposite) and generate account number dyanamically. 
 import java.util.*; 
class bank 
{ static int acc_no =10001; 
 float amt; 
 
 public void display() 
 { 
 System.out.println("Account no :"+acc_no ); 
 System.out.println("Current Amount :"+amt ); 
 } 
 public bank() 
 { 
 amt=1000; 
 System.out.println("Ur account no is "+acc_no); 
 acc_no++; 
 } 
 public void getamt() 
 { 
 System.out.println("Current balance :"+amt); 
 } 
 public void withdraw(float x) 
 { 
 if(amt==1000 || amt<=x ) 
 { 
 System.out.println("Sorry u can't withdraw"); 
 } 
 
 else 
 { 
 amt=amt-x; 
 System.out.println("amount withdrawn :"+x); 
 System.out.println("After withdrawl"); 
 getamt(); 
 } 
 } 
 public void deposit(float x) 
 { 
 if(x==0.0) 
 System.out.println("OOPS 0 can't be deposited"); 
 else { 
 amt+=x; 
 System.out.println("After deposition"); 
 getamt();} 
 
 } 
 public static void main(String args[]) 
 { Scanner sc = new Scanner(System.in); 
 bank b1 = new bank(); 
 b1.deposit(0); 
 b1.withdraw(120.5f); 
 b1.display(); 
 System.out.println("\n"); 
 bank b2 = new bank(); 
 b2.deposit(1000.0f); 
 b2.withdraw(150.5f); 
 } 
} 
