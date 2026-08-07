// package DAY18.equals;

public class equalsObjectMethod {
    public static void main(String[] args) {
        /*  equals method of Object class

        1. by default ,equal methods of OBject class compare to objects references not the value stored in them
        2.child class has to override this method if it wants to compare the exact values stored in them 
        
         */

          Object o1=new EQUALSINJAVA(20,22);
          //before overriding equals method
          System.out.println(  o1.equals(o1));  //true,coz it compare same references here

          Object o2=new EQUALSINJAVA(23,23);
          Object o3=new EQUALSINJAVA(23,23);
           System.out.println(  o1.equals(o2));  //false->coz they are diff references

           //now they are comparing references ,so i will override the Object class equals method
  
           System.out.println(  o2.equals(o3));  //true->now i have overriden the default equal method and comparing exact value stored in thm
    

           Object o4=null;
           System.out.println(o3.equals(o4));
    }
  
}

class EQUALSINJAVA{
    int age;
    int id;

    EQUALSINJAVA(int age,int id){
        this.id=id;
        this.age=age;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
    //    return (this.age==obj.age && this.id==obj.id) ;   age and id cannot be resolved or is not a field
    //if have to typecaste into EQUALSINJAVA ,because i am recieveing OBjects class and comparing with EQUALSINJAVA class 
    // both are diff

            EQUALSINJAVA obj1=(EQUALSINJAVA)obj;
            return (this.age==obj1.age && this.id==obj1.id);
    

    }
}
