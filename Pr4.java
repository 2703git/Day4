import java.util.Scanner;

public class Pr4 {
    public static int bigSmall(int a, int b, int c, int d){
        if (a==b && b==c && c==d) return a+b+c+d;
        int max = a;
        if (b>max) max=b;
        if (c>max) max=c;
        if (d>max) max=d;
        int min = a;
        if (b<min) min=b;
        if (c<min) min=c;
        if (d<min) min=d;
        return max-min;
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
        System.out.println("Result: "+bigSmall(a,b,c,d));
    }
}