public class MethodOverriding{
    public static void main(String[]args){
Dog d=new Dog();
d.eat();
    }
    }
    class Animal{
        void eat(){
            System.out.println("eat anything");
        }

    }
    class Dog extends Animal{
        void eat(){
            System.out.println("eat grass");
        }
    }
