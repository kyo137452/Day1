import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter price:");
        double price = scan.nextDouble();

        System.out.println("age is" +age);
        System.out.println("price is "+ price);

    }
}
