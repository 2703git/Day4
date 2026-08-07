import java.util.Scanner;

public class Pr5 {
    public static int product(int a, int b, int c){
        if (a==b && b==c) return 0;
        if (a==b) return c;
        if (a==c) return b;
        if (b==c) return a;
        return a*b*c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        System.out.println("Product: "+product(a,b,c));
    }
}