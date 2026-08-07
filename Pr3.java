import java.util.Scanner;

public class Pr3 {
    public static int positive(int a, int b, int c){
        if (a>0 && b>0 && c<=0){
            return a+b;
        } else if (a>0 && c>0 && b<=0) {
            return a+c;
        } else if (b>0 && c>0 && a<=0) {
            return b+c;
        }else{
            return a*b*c;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        System.out.println("Result: "+positive(a,b,c));
    }
}