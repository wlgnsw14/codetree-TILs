import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        arr[0] = 1;
        arr[1] = sc.nextInt();
        int cnt = 0;

        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            cnt++;
            if(arr[i] >= 100){
                break;
            }   
        }

        for (int i = 0; i < cnt + 2; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}