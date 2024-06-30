import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int sum2 = 0;
        int sum3 = 0;

        for(int i = 1; i <= 10; i++){
            arr[i] = sc.nextInt();
            if(i%2==0){
                sum2 += arr[i];
            }
            if(i%3==0){
                sum3 += arr[i];
            }
        }
        System.out.print(sum2+" ");
        System.out.printf("%.1f",(double) sum3/3);
    }
}