package DAY18.clone;

public class cloneinJAVA {
    public static void main(String[] args) {
        /*clone is used to clone object in java using Object 
        
        1.create a copy of Object

        if any class want clonning then compulsorily it has to implements clonnable interface
        why ?
        coz we have database or any secuirty porject we dont want our class to be clonned right
        so for that reason explicitly we have implemnet to  use this feature
        
        

        this creates a shallow copy and has to overide 
        */

       
       PERSON g2=new PERSON();
       PERSON g1 =(PERSON)g2.clone();



    }
}

class PERSON  implements Cloneable{
    int id=10;
    String name="g1";

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
