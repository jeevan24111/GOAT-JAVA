public class callbyValue {
    public static void main(String[] args) {
        
        /*call by value does not the change the  exact value of variables 
            when function is called copies of x and y are sent and they are in scope of sum function
            their scope ends when function ends
            hence leaving the x and y original values not to be changed     
        */

        int x=10,y=20;
        System.out.println("Before Call by value x and y values are :"+x+ " " +y);
        sum(x,y);
         System.out.println("AFter Call by value x and y values are :"+x+ " " +y);
    }

    static void sum(int x,int y){
        x+=10;
        y+=10;
    }
}
