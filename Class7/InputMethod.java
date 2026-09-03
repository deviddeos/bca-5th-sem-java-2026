import java.util.Scanner;

public class InputMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("The value of Num: "+ num);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println("The name is : "+ name);
        System.out.println("The value of num is : " + num);
    }
}