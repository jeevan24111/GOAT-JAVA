// package DAY19.01-Problem before enum;

public class problemBefore {
    public static void main(String[] args) {
        /* what are all the problem before we have enum classes in java 
            suppose i want to store 3 states of a payment status which are successful,pending and failed
            and i will make a sepeprate class for it and add values to them and make them as  static and final 
            so it cant be chnaged and accessed from the class and not able to abe create  any objects;
            let see thorugh an eg
        */
             int status=paymentStatus.SUCCESS;
             int status2=paymentStatus.PENDING;
             int status3=paymentStatus.FAILED;
             System.out.println(status);

             //here it is having all the values of payment Status

             /* now i have made my variables as string now i have to compare them as string then only can be compared or else it will give error */

            //  String status=paymentStatus.SUCCESS;
            //  String status2=paymentStatus.FAILED;
            //  String status3=paymentStatus.PENDING;

            //  if("success"==paymentStatus.SUCCESS){
            //     System.out.println("true");
            //  }
            //2.poor readability
             //if my varibales not in small case then it is not goint ot check it ok

             /* here i have some problme in this integer and string to make constants

             /*
                    if i have 2 classes and i campare their values
             */

                    System.out.println(ADMIN.ROLE==paymentStatus.SUCCESS);
                    //giving true ,but both are diff class and have diff menaing
                    //no logical grouping
             
            //  1.typeSafety->if i use int , all are integer i can give the same values to them
            //      type safety is gone i can assign  same values to other also

            // 2.Poor readability ->if(status==2) what's status it has to check multiple time

            // 3.no grouping->giving true ,but both are diff class and have diff menaing
                    // no logical grouping

            /* if i use string there will be lot of complications and also time taking process

            ->allowing multiple duplicates for variables  in a class
            ->problem in storing  constants using integer and string  ,then what to use to store constants in java


            there comes->ENUM(ENUMERATE TYPE)->ENUMERATION
             */

        




             

    }
}
//class payment with 3 states 
class paymentStatus{
    public final static int SUCCESS=1;
    public final static int PENDING=2;
    public  final static int FAILED=3; // type safety is gone i can assign values to other also
    public  final static int ROle=3;
    // public final static String  SUCCESS="SUCCESS";
    // public final static  String PENDING="PENDING";
    // public  final static String  FAILED="FAILED";
}

class ADMIN{
      public final static int ROLE=1;
    public final static int AGE=2;
}

