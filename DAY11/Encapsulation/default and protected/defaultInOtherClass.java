// package DAY11.Encapsulation.default and protected;

public class defaultInOtherClass {
    public static void main(String[] args) {
        /*trying to access default */

        love l1=new love();
        l1.setNameAgeYears("alex", "FRIEND", 10);
            System.out.println(l1.getName());
            System.out.println(l1.getyear());
            System.out.println(l1.gettype());

            /* i am  diff file but but i am same package so that i access them here
            
             how ->i am in default and protected folder
              i have default class in defaultModifier i can access here because i am in  same package
            */
    }
    
}
