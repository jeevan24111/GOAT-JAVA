// package DAY19.07-final words on enum;

public class finalword {
    public static void main(String[] args) {
        /*
           1.u cannot extends any class with enum class coz it has already extended ENUM class and in java
           we cannot do multiple inheritance
           2.u can only implements any interfaces


           2.why we get values() and valueOf() method from compiler why not from ENUM class
             ->ans:-Enum class have diff constants and compiler is aware of that 
             and during compilation it create  array[]  and return them as copy
             
             at compile time compiler create DIRECTION2[] $values(){
             } and  DIRECTION2[] $valuesOf(){ }

             public static void values(){
                    return $values.clone(); 
             }

             see at diagram  how methods  works for vavlues()

             $valuesOf(String)
               ->internally

               public static DIRECTION2 valueOF(String s){
               super.valueOf(DIRECTION2.Class(),s);

                this call enum class valueOf();

                doing this process is diff and thats why compiler generates this method
               }
        */ 

               /*enum uses
                 1.constants->weekday
                 2.payment status
                 3.logs(springBoot we will see it)
               */
    }
}
