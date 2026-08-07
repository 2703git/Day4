import java.util.Scanner;

public class Pr6 {
    public static int close21(int a , int b){
        if (a > 21 && b > 21) return 0;
        if (a > 21) return b;
        if (b > 21) return a;
        if (21 - a <= 21 - b) return a;
        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Result: "+close21(a,b));
    }
}