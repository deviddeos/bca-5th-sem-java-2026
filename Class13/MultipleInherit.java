interface Swimable {
    void swim();
}
interface Walkable {
    void walk();
}
class Duck implements Swimable, Walkable {
    public void swim() {
        System.out.println("Duck can Swim");
    }
    public void walk() {
        System.out.println("Duck can also Walk..");
    }
}

public  class MultipleInherit {
    public static void main(String[] args) {
        Duck obj = new Duck();
        obj.swim();
        obj.walk();
    }
}