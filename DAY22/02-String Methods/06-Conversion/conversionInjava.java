// package DAY22.02-String Methods.06-Conversion;

public class conversionInjava {
    public static void main(String[] args) {
        String s1="hell i am conversion";
           String s6=new String(String.valueOf(23));
        System.out.println(s6);

        byte [] arr=s1.getBytes();
        for(int b:arr){
            System.out.println(b);
        }
    }
}
