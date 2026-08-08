// package DAY18.hashCode;

public class hashcodemethod {
    public static void main(String[] args) {
        
        /* 
          object class hashCode method
          this methods gives hashCode of class->in the haxadecimal form
    
          they are are rules for hashCode Method

          1.if 2 objects are equal then there hascode must be same(equal)
          2.but the revrese  is not possible(if 2 hashcode are same,then their object might not be same)
        */

          Object a1=new HASHCODEJAVA(23);

          Object a2=new HASHCODEJAVA(24);
          Object a3=a1;

          System.out.println(a1.equals(a1)); //true
          //then their hashCode might be same
          System.out.println(a1.hashCode()==a1.hashCode());//true  HASHCODEJAVA@7344699f
            /*if hashcode is same  then,i need to override the hashCOde method of Object class to correct thisand they should not be same */
         
          System.out.println(a1);  //HASHCODEJAVA@7344699f
          System.out.println(a2);


           System.out.println(a2.hashCode()==a1.hashCode());//false

         
    }
}

class HASHCODEJAVA{
    int id;
    String name="raj";

    HASHCODEJAVA(int id){
        this.id=id;
    }
    public int hashCode(){
        int result=17;
        result=result*32+id;
        result=result*32+( (name==null)? 0: name.hashCode());

        return result;

        /*now both HASCODEJAVA AND OBJECT CLASS HASCODE WILL BE SAME
        1.why 17,31 is taken ,coz whose objects are not same ,their hashCode must not come equal 
                thats why 17 and 32 are taken and multiplied will give a unique hashCode and  now their hashCOde will not come same
         */
    }
}
