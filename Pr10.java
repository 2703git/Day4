import java.util.Scanner;

public class Pr10 {
    public static boolean isSquare(int a, int b) {
        return a*a==b || b*b==a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Result: " + isSquare(a, b));
    }
}