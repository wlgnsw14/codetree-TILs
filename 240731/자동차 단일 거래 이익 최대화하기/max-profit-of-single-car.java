import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int a = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] < arr[j]){
                    a = arr[j] - arr[i];
                }
                if(max < a){
                    max = a;
                }
            }
        }
        if(max == 0){
            System.out.print(0);
        }else{
            System.out.print(max);
        }
    }
}