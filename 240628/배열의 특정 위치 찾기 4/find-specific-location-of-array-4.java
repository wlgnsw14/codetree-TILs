import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = 0;
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();

            if(n == 0){
                break;
            }else if(n%2==0){
                sum += n;
                cnt++;
            }
        }
        System.out.print(cnt+" "+sum);
    }
}