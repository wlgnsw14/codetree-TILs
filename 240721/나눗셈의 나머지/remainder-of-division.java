import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        while(a > 1){
            int c = a%b;
                a /= b;
                arr[c]++;
        }

        for (int i = 0; i < 10; i++) {
            result += arr[i] * arr[i];
        }
        System.out.print(result);
    }
}