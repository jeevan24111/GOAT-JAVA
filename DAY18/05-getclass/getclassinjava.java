package DAY18.getclass;

public class getclassinjava {
    

    public static void main(String[] args) {
        /*get class is used ot get current class of an object */




         Object g1=new getclass();
    System.out.println(g1.getClass());  //return its class name
    /* instance of is used to get the object  is belong ot same class or subclass of any class */

    System.out.println(g1 instanceof Object);
    System.out.println(g1 instanceof getclass);
}
    }

   


class getclass{

}