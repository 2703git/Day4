import java.util.Scanner;

public class Pr14 {
    public static int countPositive(int a, int b, int c) {
        int count = 0;
        if (a>0) count++;
        if (b>0) count++;
        if (c>0) count++;
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        System.out.println("Result: " + countPositive(a,b,c));
    }
}