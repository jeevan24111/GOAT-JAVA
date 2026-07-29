public class ThisKeyword {
    public static void main(String[] args) {
        /*this keyword is used to refer to the current object in the class
        it it not used value of gets assigned itself again  & again */

        car Ferrari=new car("Red","Limited RED Bull edition",2023);
        System.out.println(Ferrari.color);
        System.out.println(Ferrari.Model);
        System.out.println(Ferrari.year);
    }
}
class car{
    String color;
    String Model;
    int year;

    car(String color,String Model,int year){
            /* 
                    if this is not used
                    color=color;
                    Model=Model;
                    year=year;
                    
                    their values are getting assigned to themself and object values not getting assigned

                to solve this we use " this "keyword
            */
        this.color=color;
        this.Model=Model;
        this.year=year;
    }
}