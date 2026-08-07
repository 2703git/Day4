import java.util.Scanner;

public class Pr2 {
    public static String age(int age){
        int oneS = age%10;
        int tenS = age/10;
        String[] ones = {""," bir"," ikki"," uch"," to'rt"," besh"," olti"," yetti"," sakkiz"," to'qqiz"};
        String[] tens = {"","o'n","yigirma","o'ttiz","qirq","ellik","oltmish"};
        if (age<10 || age>60){
            return "Error";
        }
        return tens[tenS]+ones[oneS]+" yosh";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age(10-60): ");
        int age = scanner.nextInt();
        System.out.println(age(age));
    }
}