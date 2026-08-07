// package DAY18.toStrings;

public class toStringJava {
    public static void main(String[] args) {
        /*
           toString is method of OBject class which is used to return a string from a fxn
           1.by default if we try to print its toString method it will give hashCode value
           2.child class cna override this and they can give their own implemntion of this toString method
           3.usually used to return a string from this function
          
        */
       Object a1=new ToSTRING(100, "DAVID", "ORACLE", 35, 120000.23);  //achieving polymorphism and ineritance
       //before giving toString implementation by child class
       System.out.println(  a1.toString());  //gives  classname@hashCode->ToSTRING@7344699f

       //now i will override the toString method
       a1.toString(); // gives tostring implmentation of child class
       
       System.out.println(a1); //if i don't give a1.toString(); also ,if i give a1 then i will same result as above
     

    }
}

class ToSTRING{
    int id;
    String name;
    String Company;
    int age;
    Double Salary;

    ToSTRING(int id,String name,String Company,int age,Double Salary){
        this.id=id;
        this.name=name;
        this.Company=Company;
        this.age=age;
        this.Salary=Salary;
    }

    @Override
    public String toString(){
        return  ("hello "+this.name+ " \n You id is "+this.id+ " \n you age is "+this.age+" \n welcome to "+this.Company+" \n your salary will be "+this.Salary);
    }
}   
