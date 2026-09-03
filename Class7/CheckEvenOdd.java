import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean evenOdd = isEven(num);
        System.out.print(evenOdd);

    }
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }
}
