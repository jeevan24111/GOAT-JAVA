// package DAY14.Local Classes;

public class LocalJavaClass {
    public static void main(String[] args) {
        /*
            Local classes are defined inside a if{} for{} methods(){} constructor(){}
            1.it is limited to that block and it cannot be accessed outside 
           2. can't add access modifiers private/public
           3.methods variables are accessed when they are final or effective final variable

           
           eg->imagine u have a meeting at your home (method) and you need a temporary assistant (local class) whose name is MeetingHelper.U use him in meeting multiple times.Once Meeting finished helper work also finished
        */

           //creating objects
           OuterLocal l1=new OuterLocal();
           l1.MyCalculator();
           l1.help();
    }
    

}

class OuterLocal{
  

    void MyCalculator(){
        class Calculator{
             int add(int a,int b){
                return a+b;
            }
             int sub(int a,int b){
                return a-b;
             }

             //i can't create objects here coz it is class (blueprint)
            
        }
        Calculator c1=new Calculator();
        Calculator c2=new Calculator();
        System.out.println(c1.add(5,10));
        System.out.println(c2.sub(5,10));

        //it get execute if other class is also mentioned 
        //objects and class both are created here only
        //once you crate outside class object and try to access this method
        //it sees class defined and below that objects is created for that and start executing whatever is present
        //helper clas for this method

        class Helper{

            int age;
            String name;
            Helper(String name,int age){
                this.age=age;
                this.name=name;
            }

            void iamHelper(){
                System.out.println("my name "+name+" my age is "+age);
            }
        }
        Helper h1=new Helper("API", 12);
        h1.iamHelper();
    }
    void help(){
          class Helper{

            int age;
            String name;
            Helper(String name,int age){
                this.age=age;
                this.name=name;
            }

            void iamHelper(){
                System.out.println("my name "+name+" my age is "+age+" i am after above function");
            }
        }
        Helper h1=new Helper("API", 12);
        h1.iamHelper();
    }
}
