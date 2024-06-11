import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= a; j++) {
                    cnt += 1;
                    System.out.print(cnt + " ");
                }
            }
            else {
                for (int j = 0; j < a; j++) {
                    cnt += 2;
                    System.out.print(cnt + " ");
                }
            }
            System.out.println();
        }
    }
}