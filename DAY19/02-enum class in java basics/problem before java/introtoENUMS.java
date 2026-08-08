// package DAY19.02-enum class in java basics.problem before java;

public class introtoENUMS {
    public static void main(String[] args) {
        /*
           ENUMS IN JAVA
           ->also known as ENUMERATION OR ENUMERATE TYPE

           we know that what are all the problem we had initially
            1.Type safety( i can easily change status value 1 to 100 )
            2.poor readabilty
            3.NO grouping 

            we had used string and integer to store constants and we got these above problems in them

            for that enum came to solve the problems to store constants

            ENUMS ARE USED TO STORED CONSTANTS VALUES IN JAVA AND SOLVE ALL THE ABOVE PROBLEMS

        */

             //accessing the enum values

                PaymentStatus SUCCESS=PaymentStatus.SUCCESS ;//type is PaymentStatus of s1
                PaymentStatus SUCCESS1=PaymentStatus.SUCCESS ;//type is PaymentStatus of s3
                PaymentStatus FAILED=PaymentStatus.FAILED; //type is PaymentStatus of s2
                
                //1.solve the type safety problem (now i cant the assigned values to the constants)
                // FAILED=0; Type mismatch: cannot convert from int to PaymentStatus


                //2.poor readabilty solved
                System.out.println(SUCCESS==SUCCESS1);
                //it can easily know what is comparing what with what 
                //no need to get confused

                // System.out.println(SUCCESS==1);  Incompatible operand types PaymentStatus and int
                // System.out.println(FAILED==2);    //clear poor readability problem


                //3.proper grouping of values of constants diff classes
                admin role=admin.role;

                // System.out.println(SUCCESS==role); Incompatible operand types PaymentStatus and admin
                //clear no grouping problem

                //all the problem before enums are solved

                //give errors at compile time only


    }
    
}

//creating an enum
enum PaymentStatus{
    SUCCESS,
    PENDING,
    FAILED,
    // SUCCESS ->Duplicate field PaymentStatus.SUCCESS
    //no duplicates are allowed
};
enum admin{
    role,
    name
};
