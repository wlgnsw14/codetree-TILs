import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a; j++) {
                    System.out.print(j + 1);
                }
            }
            else {
                for (int j = 0; j < a; j++) {
                    System.out.print(a - j);
                }
            }
            System.out.println();
        }
    }
}