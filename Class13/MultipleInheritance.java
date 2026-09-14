interface Swimable {
    void swim();
}
interface Walkable {
    void walk();
}

class Duck implements Swimable, Walkable {  
    public void swim() {
        System.out.println("duck can swim...");
    }

    public void walk() {
        System.out.println("Duck can walk as well..");
    }
}

public class MultipleInheritance {
    public static  void main(String[] args) {
        Duck obj = new Duck();
        obj.swim();
        obj.walk();
    }
}
