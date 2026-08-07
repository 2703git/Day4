import java.util.Scanner;

public class Pr13 {
    public static int changeNumber(int n) {
        if (n>0) return n+1;
        if (n<0) return n-2;
        return 10;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        System.out.println("Result: " + changeNumber(n));
    }
}