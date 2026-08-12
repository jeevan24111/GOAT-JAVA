// package DAY23.02-BEFORE JAVA GENERICS;

public class objectclass {
    public static void main(String[] args) {
        /*   2.So object class parent of it can all type of values but also dont know what exactly it stores,so that manually we have to convert them to theri respective data type and then only we can perform any operation */

        aluesIN a2=new aluesIN(23);
        aluesIN a3=new aluesIN("hello");
        aluesIN a4=new aluesIN(true);
        // System.out.println(a2.getvalue()+5); //The operator + is undefined for the argument type(s) Object, int
        // System.out.println(a3.getvalue()+5); //The operator + is undefined for the argument type(s) Object, int
        // System.out.println(a4.getvalue()+5); //The operator + is undefined for the argument type(s) Object, int
            int s1=(Integer)a2.getvalue();
            String s2=(String)a3.getvalue();
            boolean s3=(Boolean)a4.getvalue();
            System.out.println(s1+5);
            System.out.println(s2+5);
            //28
            //hello5
            //here also we have convter manually to achieve anytype it can handle
    }

}

class aluesIN{
    private Object value;
    aluesIN(Object value){
        this.value=value;
    }

    public Object getvalue(){
        return value;
    }
}
