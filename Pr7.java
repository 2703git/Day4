import java.util.Scanner;

public class Pr7 {
    public static int century(int year) {
        return (year + 99) / 100;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Result: " + century(year));
    }
}