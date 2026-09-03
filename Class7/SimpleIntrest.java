import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of P: ");
        float p = sc.nextFloat();
        System.out.println("Enter a value of T : ");
        float t = sc.nextFloat();
        System.out.println("Enter a value of R: ");
        float r = sc.nextFloat();

        float si = (p*t*r)/100;

        System.out.println("Simple Interest: "+ si);
    }
}
