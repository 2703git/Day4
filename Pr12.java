import java.util.Scanner;

public class Pr12 {
    public static void change(double a, double b, double c) {
        if ((a<b && b<c) || (a>b && b>c)) {
            a*=2;
            b*=2;
            c*=2;
        } else {
            a=-a;
            b=-b;
            c=-c;
        }
        System.out.println("Result: " + a + " " + b + " " + c);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        change(a,b,c);
    }
}