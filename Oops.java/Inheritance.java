public class Inheritance{
    public static void main(String[]args){
    Bird dobby=new Bird();
dobby.fly();

    }
}
    //Base class
    class Animal{
        String color;
        void eat(){
            System.out.println("eating");
        }
        void breathe(){
            System.out.println("breathe");
        }
    }
    /*//Derived class
    class Fish extends Animal{
        int fins;
        void swim(){
            System.out.println("swims in water");
        }

    } */
    /*class Mammal extends Animal{
        int legs;
    }
class Dog extends Mammal{
    String breed;
}*/
class Mammal extends Animal{
    void Walk(){
    System.out.println("walk");
}
}
class Fish extends Animal{
    void Swim(){
        System.out.println("swim");
    }

}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}