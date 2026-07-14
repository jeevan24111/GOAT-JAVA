public class firstJ{
    public static void main(String[] args) {
        System.out.println("hello JAVA");

        System.out.println("hello world");

        short s=10;
        byte b=2;
        int i=b;
        double d=22.23234567565646;
         float f=(float)d;
        long l=123753421l;

        int f1=(int)d;
        int f2=(int)f;

        System.out.println(s);
        System.out.println(b);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);
        System.out.println(f1);
        System.out.println(f2);

        System.out.printf("hello naman ,"+"your age is %d",s);
        System.out.println("");
        if(args.length>=1){
             System.out.println("First :"+args[0]);
            System.out.println("second :"+args[1]);
        }
        //Implicit casting
        byte byteVar = 42;
        short shortVar = byteVar;
        int intVar = shortVar;

        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);

        //int badInt   = (int)  true; // Compiler error: incompatible types

    }
}