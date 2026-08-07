import java.util.Scanner;

public class Pr11 {
    public static int sumOddPositive(int a, int b, int c, int d, int e) {
        int sum = 0;
        if (a>0 && a%2!=0) sum+=a;
        if (b>0 && b%2!=0) sum+=b;
        if (c>0 && c%2!=0) sum+=c;
        if (d>0 && d%2!=0) sum+=d;
        if (e>0 && e%2!=0) sum+=e;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        System.out.print("Enter d: ");
        int d = scanner.nextInt();
        System.out.print("Enter e: ");
        int e = scanner.nextInt();
        System.out.println("Result: " + sumOddPositive(a,b,c,d,e));
    }
}