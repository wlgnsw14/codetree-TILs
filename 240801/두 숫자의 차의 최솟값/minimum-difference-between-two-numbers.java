import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int a = 0;
        int min = 100;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    continue;
                }
                if(arr[i] > arr[j]){
                    a = arr[i] - arr[j];
                }else{
                    a = arr[j] - arr[i];
                }
                if(min > a){
                    min = a;
                }
            }
        }
        System.out.print(min);
    }
}