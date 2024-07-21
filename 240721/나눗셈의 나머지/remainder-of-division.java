import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int result = 0;

        for (int i = 0; i < 50; i++) {
            if(a <= 1){
                break;
            }else{
                c = a%b;
                a /= b;
                arr[c]++;
            }
        }

        for (int i = 0; i < 9; i++) {
            result += arr[i] * arr[i];
        }
        System.out.print(result);
    }
}