package DAY11.UserDefinedPackages;
// import package1.*;
// import package2.*;

 import DAY11.UserDefinedPackages.package2.*;
//  import DAY11.UserDefinedPackages.package1.*;

public class packageInJava {
  public static void main(String[] args) {
     /*
      in java we have user defined and build in packages

      user defined packages are created by user 
      built in package are provided by java 
    
    */


      //lets see how to create our user define pacakge

      /*
        i am in userDefined package 
        now i want  other class here and run them

        so we have to import them 
        syntax -> import packagename.classname

        i have 2 packages called
         package1 which have college class 
         package2 which have school class

         i want to run them here
      
      */

          // Student s1=new  Student();
           s1.print();
          //  package2.student s2=new  package2.student();
           s2.print();

          //  package1.Student=new package1.Student();


  }
   
    
}
