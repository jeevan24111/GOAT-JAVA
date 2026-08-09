// package DAY20.05-Multiple Inheritance;

public class multipleInheritance {
    public static void main(String[] args) {
        /* multiple inheritance in java
          i have i 2 interface and some methods given by those interface 
          then implemetnig class want both interfaces the it has to give defination to both interface methods

          ->through this we can achieve multiple inheritance in java
        */
        runnable r=new Human();
        r.run();
        //    r.walk(); The method walk() is undefined for the type runnable
      walkable w=new Human();
        w.walk();
        // w.run();The method run() is undefined for the type walkable

        Human boy=new Human();
        boy.run();
        boy.walk();
        boy.vision();
    }
}

interface runnable{
         void run();
}
interface walkable{
         void walk();
}

class Human implements runnable,walkable{
        @Override
        public void run(){
              System.out.println(" i am a human ,i can also run");
        }

        @Override
        public void walk(){
        System.out.println("i am human,-> i can also walk");
        }

        public void vision(){
            System.out.println("i am human,i have vision");
        }
}


