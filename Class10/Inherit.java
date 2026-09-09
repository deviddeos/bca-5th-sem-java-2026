class Animal{
    String sound;

    Animal(int x, int y) {
        System.out.println("The value of x and y = "+x+", "+ y);
        System.out.println("Call from animal constructor...");
    }
    Animal() {
        System.out.println("This constructor is call by 2nd constructor of DOG class.");
    }

    public void eat() {
        System.out.println("Animal can eat");
    }
    public void run() {
        System.out.println("Animal can Run..");
    }
}
class Dog extends Animal {
    String bark;

    Dog() {
        super(5, 6);
        System.out.println("Call from Dog Constructor...");
    }
    Dog(int a) {
        super();
        System.out.println("The value of a = "+ a);
    }
}

public class Inherit {
    public static void main(String[] args) {
        // Dog obj = new Dog();
        Dog obj2 = new Dog(10);
        // obj.eat();
    }
}