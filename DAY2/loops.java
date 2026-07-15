public class loops {
    public static void main(String[] args) {
        //if 

        int x=10;
        if(x>15){
            System.out.println("you are very great");
        }

        // if-else
        char c='A';
        if(c=='B'){
            System.out.println("You blood group is B");
        }else{
            System.out.println("your blood group is A");
        }

        //if-else-if
        String s="College";
        if(s=="Home"){
            System.out.println("you are at home");
        }else if(s=="college"){
            System.out.println("You are at college");
        }else{
            System.out.println("you are at a unknown location");
        }

        //switch
        char operator='%';
        int z=10,y=20;
        switch (operator) {
            case '+':System.out.println(z+y);break;
            case '-':System.out.println(z-y);break;
            case '*':if(z==0){
            System.out.println("Divided by zero error");
            }else{
                  System.out.println(z*y);break;
            }
                System.out.println(z*y);break;
            case '/':System.out.println(z/y);break;
            case '%':System.out.println(z%y);break;
            default:
            System.out.println("Unknown operator");
                break;
        }


        //LOOPS

        for(int i=0;i<100;i+=20){
              System.out.println(i);
        }
         for(int i=100;i>0;i-=20){
              System.out.println(i);
        }
            //nested loops
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                System.out.print("hello_JAVA"+" ");
            }
            System.out.println();
        }
         System.out.println();

        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
         System.out.println();

        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("%"+" ");
            }
            System.out.println();
        }
         System.out.println();

        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("%"+" ");
            }
            System.out.println();
        }

         System.out.println();

         for(int i=4;i>0;i--){
            for(int j=0;j<i;j++){
                 System.out.println("");
                //   for(int k=0;k<i;k++){
                //      System.out.println("*");
                  
            }
           
         }


         //while loop
         //starter condition increment
         int d=0;
         while(d!=5){
            System.out.println("i am not d");
            d++;
         }

         //do while
         //even if condition is wrong it runs one time
         int f=1;
         do{
            System.out.println("hello i am do while");
            f++;
         }while(f!=2);

    }
}
