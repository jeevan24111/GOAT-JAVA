// package DAY24.02-Read and Write In Wildcards;

import java.util.ArrayList;
import java.util.List;

public class readinginList {
    public static void main(String[] args) {
        
        List<Animal> a=new ArrayList<>();
        a.add(new Animal());
        a.add(new Animal());
        a.add(new Animal());
    
        reading(a);
        List<Dog> d=new ArrayList<>();
        d.add(new Dog());
        d.add(new Dog());
        d.add(new Dog());
        reading1(d);

    }
    public static void reading(List<?> a){
        // for(int i=0;i<a.size();i++){
        //     System.out.println(a.);
        // }
      
    }

    //extends is used when we have to read values from list and we cannot add values while we are reading

    public static void reading1(List<? extends Animal> a){
          for(Animal d1:a){
            System.out.println(d1.age);
            d1.run();
          }
    }
}

class Animal{
    int age=20;
    String color="black";


    void eat(){
        System.out.println("Animal is eating");
    }

    void run(){
        System.out.println("Animal is running");
    }
}

class Dog extends Animal{

}

class Cat extends Animal{

}
