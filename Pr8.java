import java.util.Scanner;

public class Pr8 {
    public static boolean equalThird(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        System.out.println("Result: " + equalThird(a, b, c));
    }
}