class Demo1 {
    int x, y;

    Demo1() {
        System.out.println("Hello from Demo1 class....");
    }
    int addNum(int a, int b) {
        return  a+b;
    }

    int addNum (int a, int b, int c) {
        return  a+b+c;
    }
    int addNum() {
        return 0;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        
        System.out.println(obj.addNum(2,3));
        System.out.println(obj.addNum(2,3, 4));
        // System.out.println(obj.addNum(2,3, 4, 5));


    }
}