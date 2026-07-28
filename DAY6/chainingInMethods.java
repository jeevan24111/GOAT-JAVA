package DAY6;
public class chainingInMethods {
    public static void main(String[] args) {
        /*chaining of functions in JAVA */


        A();

        /*calling fxn a called b fxn in it
         and 
         hence b fxn call c fxn and  executes all  c function
         from program comes back to b and then a */
    }
    static void A(){
        B();
         System.out.println("I am Function A");

    }
    static void B(){
        C();
          System.out.println("I am Function B");  
    }
    static void C(){
         System.out.println("I am Function c");
    }
    
}
