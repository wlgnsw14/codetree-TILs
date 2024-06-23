import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 1;
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            for (int j = b; j <= c; j++) {
                sum *= j;
            }

            System.out.println(sum);
            sum = 1;
        }
    }
}