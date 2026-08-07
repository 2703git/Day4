import java.util.Scanner;

public class Pr1 {
    public static int biggest(int n){
        int ones = n%10;
        int tens = (n%100)/10;
        int hundreds = n/100;
        if (hundreds>tens && hundreds>ones){
            return hundreds;
        } else if (tens>hundreds && tens>ones) {
            return tens;
        } else if (ones>hundreds && ones>tens) {
            return ones;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3-digits number: ");
        int n = scanner.nextInt();
        System.out.println("Biggest digit: "+biggest(n));
    }
}