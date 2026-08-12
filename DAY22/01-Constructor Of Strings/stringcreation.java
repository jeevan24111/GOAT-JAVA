public class stringcreation{
    public static void main(String[] args){
        /*string creation method using constructor and strings are immutable */

        //1.
        String s=new String("");
        //2.
        String s1=new String();
        System.out.println(s);
        System.out.println(s1);

        //3.
        String s2=new String("hello");
        System.out.println(s2);


        //4.by passing an char[]->since we know that string uses char[] 
        char[] name={'A','B','C','D'};
        String s3=new String(name);
        System.out.println(s3);
        name[0]='Z';
          System.out.println(s3);

        //5.passing an array of bytes into String class constructor

        byte[] byte1={97,98,56,34,22};
        String s4=new String(byte1);
        System.out.println(s4);

        //if i need a small part of array

        String s8=new String(name,0,3);
        System.out.println(s8);

        String s6="hello";
        String s7=new String ("hello");
        System.out.println(s6==s7);


        //String builder and buffer

        StringBuilder sb=new StringBuilder("hii");
        System.out.println(sb);

        StringBuffer bf=new StringBuffer("jijji");
        System.out.println(bf);

        /* methods of creating string in java 
           1.new String("")
           2.new String()
           3.new String("hell")
           4.new String(char [])
           5.new String(byte [])
           6.new StringBuilder("hii")
           7.new StringBuffer("jijji")   
        */

    }
}