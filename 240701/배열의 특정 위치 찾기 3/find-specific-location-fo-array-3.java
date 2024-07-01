import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        int cnt = 0;
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            n = sc.nextInt();
            if(n == 0){
                for(int j = cnt - 1; j > cnt-4; j--){
                    sum += arr[j];
                }
                break;
            }else{
                arr[i] = n;
                cnt++;
            }
        }
        System.out.println(sum);
    }
}