import java.util.Scanner;

public class InputMethod {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.println("Value of a : "+ a);


        System.out.print("Enter a number: ");
        int b = input.nextInt();
        System.out.println("Value of b : "+ b);

        System.out.print("Enter a name: ");
        // String name = input.next();
        String name = input.nextLine();
        System.out.println("Name is : "+name);
    }
}
