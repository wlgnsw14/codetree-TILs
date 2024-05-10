import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int cnt = 0;

        for(int i = 1; i <= a; i++){
            int b = sc.nextInt();
            sum += b;
        }

        System.out.print(sum + " " + String.format("%.1f", (float)sum / a));
    }
}