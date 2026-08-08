package DAY18.hashCode.getClass;
public class getCLassjava {
    public static void main(String[] args) {
        /* getClass in java returns a java class name its working on 
                 returns the runtime class of an object
        
        */

        Object g1=new getCLassinjava(23);
        System.out.println(g1.getClass()); 
        Object g2=new getCLassinjava(245);  //returns the runtime class of an object

        /*insatnceOf opertors is used chekc if it belong to same class or subclass of it */
 
        System.out.println(g1 instanceof Object);  //check whether g1 is class of Object or subclass of parent and for all class it belongs to
        System.out.println(g1 instanceof getCLassinjava);
        // System.out.println(Object instanceof   getCLassinjava);
        System.out.println(g2 instanceof Object);

    }
}


class getCLassinjava{
    int id;
    String name="raj";

    getCLassinjava(int id){
        this.id=id;
    }
    // public final Class<?> getClass(){
        //fdefault implementation 
    // }
    public int hashCode(){
        int result=17;
        result=result*32+id;
        result=result*32+( (name==null)? 0: name.hashCode());

        return result;

    
    }
}
