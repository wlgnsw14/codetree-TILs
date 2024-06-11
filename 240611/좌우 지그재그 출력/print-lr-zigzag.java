import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= a; j++) {
                    System.out.print((a * i) + j);
                    System.out.print(" ");
                }
            }
            else {
                for (int j = 0; j < a; j++) {
                    System.out.print((i - 1 + 2) * a - j);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}