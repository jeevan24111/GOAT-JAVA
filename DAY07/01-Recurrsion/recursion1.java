public class recursion1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /* recursion means calling a function again and again */
            int x=5;
           int fac= factorial(5);
           //Normal factorial method
           System.out.println(fac);

           //recursive factorial call
           int y=3;
           int rec=RecursiveFactorial(y);
            System.out.println(rec);
    }
    static int factorial(int x){
        int fact=1;

        for(int i=1;i<=x;i++){
            fact*=i;
        }
        return fact;
       
    }
    static int RecursiveFactorial(int n){
        if(n==1) return 1; //base check
        return n+RecursiveFactorial(n-1);
    }

}
