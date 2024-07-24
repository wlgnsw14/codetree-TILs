import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        int minVal = arr[0];
        int cnt = 0;

        for (int i = 0; i < a; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        for (int i = 0; i < a; i++) {
            if (arr[i] == minVal) {
                cnt++;
            }
        }

        System.out.println(minVal+" "+cnt);
    }
}