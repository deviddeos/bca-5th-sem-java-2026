class Demo {
    int x;
    int y;
    // Demo() {
    //     System.out.println("Called from constructor...!");
    // }
    Demo(int a, int b){
        x = a;
        y = b;
    }
    void display() {
        System.out.println("Value of x = "+ x);
        System.out.println("Value of y = "+ y);
    }
}

public class First {
    public static void main(String[] args) {
        Demo obj = new Demo(4, 5);
        obj.display();
    }
}