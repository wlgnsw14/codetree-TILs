import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        int n;

        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            if(n%3==0){
                break;
            }else{
                arr[i] = n;
                cnt++;
            }
        }
        System.out.print(arr[cnt - 1]);
    }
}