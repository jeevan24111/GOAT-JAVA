// package DAY24.01-Before Java WildCards;

import java.util.ArrayList;
import java.util.List;

public class beforejavaWild{
    public static void main(String[] args) {
        /*As we know ,A parent object can point to child object and from that also we can call the methods of parent class not the methods of child class */

        Animal a=new Dog();
        a.eat(); //call dog method coz it is pointing to it 
        a.run();
        // a.bark(); this is  not allowed coz i can't do it

        Dog g=new Dog();
        g.bark();
        g.eat();
        g.run();

        Animal a2=new Animal();
        a2.eat();
        a2.run();

        /*java Generics breaks the parent child relationship in java
        how ??
          for that we have LIST in java
          which is a interface which consists of methods which are implements by implementing classes

          for now assume list methods are implemented by ArrayList

          assume it as a collection of list
          like collection books,animals etc

          eg:-Imagine a List of dogs and animals 
          where in list of Dogs i cannot place any animals right
          and in the list  of animals i cannot place any dog over there

          if i do,then parent child relationship will be broken

          in normal,
          dog is a animal

          but list of Dogs cannot belong to list of Animals
        */

        List<Animal> f1=new ArrayList<>();
        f1.add(new Animal());
        f1.add(new Animal());
        f1.add(new Animal());

        List<Dog> d1=new ArrayList<>();
        d1.add(new Dog());
        d1.add(new Dog());
        d1.add(new Dog());
        // d1.add(new Animal());
        // The method add(Dog) in the type List<Dog> is not applicable for the arguments (Animal)

        for(int i=0;i<f1.size();i++){
          f1.getClass().getName();
        }
         for(int i=0;i<f1.size();i++){
            d1.getClass().getName();
        }


    }
}
class Animal{
    int Age;

    void eat(){
        System.out.println("animal is eating");
    }

    void run(){
        System.out.println("Animal is running");
    }
}

class Dog extends Animal{

    @Override 
    void eat(){
        System.out.println("Dog is eating");
    }

    @Override 
    void run(){
        System.out.println("dog is running");
    }

    void bark(){
        System.out.println("Dog is barking");
    }
}