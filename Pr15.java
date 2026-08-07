import java.util.Scanner;

public class Pr15 {
    public static void printOrder(int a, int b) {
        if (a>b)
            System.out.println("Result: "+a+" "+b);
        else
            System.out.println("Result: "+b+" "+a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        printOrder(a, b);
    }
}