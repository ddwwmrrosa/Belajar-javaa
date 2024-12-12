import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String kata = input.next();

        String kataBalik = new StringBuilder(kata).reverse().toString();

        if (kata.equalsIgnoreCase(kataBalik)) {
            System.out.println(kata + " merupakan palindrom");
        } else {
            System.out.println(kata + " bukan palindrom");
        }
    }
}