// package DAY11.Encapsulation.public modifiers;

public class publicModifiers {
    public static void main(String[] args) {
        /*
           public modifiers means giving full access you can access them from anywhere
           always take care of giving public access
        */

        BankAccount b1=new BankAccount();
        System.out.println(b1.balance); 
        b1.balance=52323.2;       // i can easily set balance ->coz it is public 
         System.out.println(b1.balance); 
        b1.deposit(5000.00);
       System.out.println(b1.showbalance()); 
       b1.withdraw(3200.00);
       System.out.println(b1.showbalance());
       b1.deposit(-1);
       b1.withdraw(200000.0);
        System.out.println(b1.showbalance());
    }

    /*private->accessible only within the class 
    not visible to other,use getters and setters for set private variables 
    */
    
}


class BankAccount{
    public double balance;

    public void deposit(double balance){
        if(balance<0){
            System.out.println("Invalid Entry");
        }else{
             this.balance+=balance;
        }
       
    }
    
     public void withdraw(double balance){
          if(balance<0 || balance >this.balance){
            System.out.println("Invalid Entry");
        }else{
             this.balance-=balance;
        }
       
    }

    public double showbalance(){
        return balance;
    }
}

    
