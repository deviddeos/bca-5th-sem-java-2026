abstract class Demo {

    Demo() {
        System.out.println("call from demo constructor...");
    }
    void f1() {
        System.out.println("Hello from demo class");
    }
    abstract void f2();
}
class Demo2 extends Demo {
    Demo2() {
        super();
        System.out.println("call from Demo2 class...");
    }
    void f2() {
        System.out.println("Hello from Demo2..");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        // obj.f1();
    }
}