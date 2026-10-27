public class extendedgenerics{
    public static void main(String[] args) {
         /*now lets see how the generics works with extends keyword
          suppose if my class only want to work with number class not than other 
          then we can we extends keywords
         */

          Testing<Integer> a1=new Testing(23);
          Testing<Long> a2=new Testing(25);
          Testing<Short> a3=new Testing(33);
          Testing<Byte> a4=new Testing(26);
          Testing<Float> b1=new Testing(233.3f);
          Testing<Double> b2=new Testing(23.242432);

          System.out.println(a2.getvalue());
          System.out.println(a1.getvalue());
          System.out.println(a3.getvalue());

          
          System.out.println(a4.getvalue());
          System.out.println(b2.getvalue());
          System.out.println(b1.getvalue());
          System.out.println(a2.getvalue());
          System.out.println(a1.getvalue());
          System.out.println(a3.getvalue());







        //   Testing<String> a2=new Testing("hello");

    }

}


class Testing<T extends  Number>{
    private  T value;

    Testing(T value){
        this.value=value;
    }

    T getvalue(){
        return value;
    }

    void setvalue(T set){
        this.value=set;
        
    }
}