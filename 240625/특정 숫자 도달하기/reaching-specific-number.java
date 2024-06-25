import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int cnt = 0;
        double avg = 0.0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        while(true){
            if(arr[cnt] >= 250){
                break;
            }else{
                sum += arr[cnt];
                cnt++;
            }
        }
        avg = (double) sum/cnt;
        System.out.print(sum+" ");
        System.out.printf("%.1f", avg);
    }
}