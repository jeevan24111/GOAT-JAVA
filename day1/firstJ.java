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

        //non numeric conversions
        char c2='$';
        char c1=(char)65;
        int i1=(int)c2;
        short s2=(int) 'B';
        byte b2=(int) 'G';


        System.out.println(c1);
        System.out.println(i1);
        System.out.println(s2);
        System.out.println(b2);
        char c3=(char) 8231;
        System.out.println(c3);

        byte byte2   = (byte)  '‽'; // 61 (truncated code-point into the ASCII range)
        System.out.println(byte2);

        //Section 2.4: Object casting

        // Float var=new Float(42.02f);
        Number n=var;
        Float var2=(Float)n;
        Double D1=(Double)n;

        System.out.println(n);
        System.out.println(var2);
        System.out.println(D1);
    }
}