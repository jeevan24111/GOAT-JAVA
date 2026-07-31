package DAY11.Encapsulation.privateModifers;
public class Encapsule {
    public static void main(String[] args) {
        /*
            what are encapsulation 
            -> means protecting or encapsulating inside  a capsule
            ->eg capsule ->protected from outside

            think of a bank accn ->where you can set your balance by yourself or other trying to accessing  your balance
            not good right..
        here comes access modifiers to solve this
        ->they help us to give access to variables,class,method and constructor

        there are 4 variables->public,default,protected and private
        
        */

        BankAccount b1=new BankAccount();
        // System.out.println(b1.balance); rhe field BankAccount.balance is not visible Java(335545e3

        b1.deposit(50000.00);
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
    private double balance;

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
