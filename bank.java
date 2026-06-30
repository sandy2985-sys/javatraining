// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your 4 digit pin:");
        int n=sc.nextInt();
        if( n==1234){
            System.out.println("Welcome");
            int balance=10000;
            
            while(true){
                System.out.println("Enter your choice(1/2/3/4)");
                int choice=sc.nextInt();
                switch(choice){
                    case 1:
                        
                            System.out.println("Your current balance is:"+balance);
                            break;
                
                    case 2:
                        
                            System.out.println("Enter your withdraw amount:");
                            int withdraw=sc.nextInt();
                            if(withdraw>balance){
                                System.out.println("Insufficient");
                            }
                            else if(withdraw%100 !=0){
                                System.out.println("Invalid amount");
                                
                            }
                            else{
                            
                            balance=balance-withdraw;
                            System.out.println("Withdraw successful");
                            }
                            break;
                        
                    case 3:
                        
                            System.out.println("Enter the amount:");
                            int deposit=sc.nextInt();
                            balance=balance+deposit;
                            System.out.println("Deposited successful");
                            break;
                        
                    case 4:
                        
                            System.out.println("thank you");
                            return;
                        
                    default:
                        System.out.println("Invalid");
                        break;
                    
                    

                }   
            }
        }
        else
        {
            System.out.println("Invalid password");
        }
        
        
    }
}