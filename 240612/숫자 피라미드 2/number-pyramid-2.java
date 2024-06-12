import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 1; j <= i + 1; j++) {
                cnt++;
                System.out.print(cnt + " ");
            }
            System.out.println();
        }
    }
}