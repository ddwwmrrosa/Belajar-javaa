import java.util.Scanner;

public class SegitigaSamaSiku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan alas segitiga: ");
        int alas = input.nextInt();

        for (int i = 1; i <= alas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}