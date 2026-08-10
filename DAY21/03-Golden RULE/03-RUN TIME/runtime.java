public class runtime{
    public static void main(String[] args){
        /* 
           Run time strings are those which are created during run time of compilation and these are created in heapa nd later copied to string pool also
           but main point is no one is pointing to it
        */
       String s1="hello";
       String s2=s1+" hello";  //here it has check it is in s1 which is only possible during run time
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s1==s2);

       /* if i create string with new keyword it is created in heap and later it also copied ot string 
       and no one is pointing to */

       String s3=new String("iam");
       String s4="iam";
        System.out.println(s3==s4);  //false

    }
}