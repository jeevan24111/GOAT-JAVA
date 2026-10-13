// package DAY24.01-Before Java WildCards;

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