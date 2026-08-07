import java.util.Scanner;

public class Pr9 {
    public static void largestTwo(int a, int b, int c) {
        if (a <= b && a <= c)
            System.out.println("Result: " + b + " " + c);
        else if (b <= a && b <= c)
            System.out.println("Result: " + a + " " + c);
        else
            System.out.println("Result: " + a + " " + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        largestTwo(a, b, c);
    }
}