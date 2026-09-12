class Sam1 {
    int x, y;
    void speaker() {
        System.out.println("Speaker is from Sam1");
    }
    void mic(int n) {
        System.out.println("mic is from Sam1 and total number of mic is ="+n);
    }
}
class Sam2 extends Sam1{
    void mic(int n) {
        System.out.println("Noise cancellation mic is from Sam2 the number of mic is = "+ n);
    }
}
class Sam3 extends Sam1 {
    void mic(int n) {
        System.out.println("Noise cancellation mic is from Sam3 the number of mic is = "+ n);
    }
}


public class MethodOver {
    public static void main (String[] args) {
        Sam1 obj = new Sam2();
        obj.mic(5);
        Sam1 obj2 = new Sam3();
        obj2.mic(10);
    }
}
