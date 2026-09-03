import java.util.Scanner;

public class AreaRectangle {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length: ");
        int l = sc.nextInt();
        System.out.print("Enter a breadth: ");
        int b = sc.nextInt();

        int area = l*b;
        System.out.println("Area of Rectangle is : "+ area);

    }
}
