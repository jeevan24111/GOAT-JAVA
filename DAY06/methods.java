package DAY06;
public class methods {
    public static void main(String[] args){

        //Function(Method) in java is code block which is written once and can be called anytime
        /* it is a reusable block of code that can be called upon function call

        A task which will be used for repeated time

         */
            int x=10,y=20;
            sum(x,y);

            //sum(x,y) can pass 2 argument and it can be called anytime
            

            // to create a function
            //static if your in main class function

       //return_type function_name(parameters with date type mentioned)
        /*  static void sum(int x,int y){
                System.out.println(x+y);
            } */
            
        /* function have 4 types
            1.With input,no output
            2.With input,with output
            3.without input,with output
            4.without input,without output
         */

        //  1.With input,no output
          sum(x,y);

        //  2.With input,with output
        String first="Jeevan",second="Bahaddur";
        String fn=FullName(first, second);
        System.out.println(fn);

        //   3.without input,with output
        String wl=welcome();
        System.out.println(wl);

        //    4.without input,without output
        representJava();


    }
     //   1.With input,no output
    static void sum(int x,int y){
        System.out.println(x+y);
    } 

    //  2.With input,with output
    static String FullName(String first,String Second){
                return first+" "+Second;
    }
    static String welcome(){
        return "hello,Welcome to Java";
    }
    static void representJava(){
        System.out.println("hello world!!!! from java");
    }
    
}
