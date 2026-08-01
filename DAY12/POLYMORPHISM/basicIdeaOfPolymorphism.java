public class basicIdeaOfPolymorphism {
    public static void main(String[] args) {
        /* polymorphism means many forms
           poly->many
           morphism ->forms


           eg-> a person can be a student,son,father and many more at same time
           ->this gives idea of polymorphism to us 

           java gives us 2 types  of polymorphism 
           1.compiled time polymorphism (method overloading)
           2.Run time polymorphism(method overriding)
        */

           
        //  1.compiled time polymorphism (method overloading)
        /* at run time only which to call for that reason it is called compiled time polymorphism */
           calculate c1=new calculate();
          System.out.println( c1.add(2,3));
          System.out.println(  c1.add(2,3,5));
          System.out.println(  c1.add(2.5f,5.3f));
          System.out.println(  c1.add(2.5,5.3));
          System.out.println(  c1.add(2.5,5.9));

          //JVM knows which add function to call before executing it ,i.e called complied time polymorphism

        
          
    }
    
}

class calculate{
    

    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }

    double add(float a,float b){
        return (double) a+b;
    }
    float add(double a,double b){
        return (float) (a+b);
    }

}


