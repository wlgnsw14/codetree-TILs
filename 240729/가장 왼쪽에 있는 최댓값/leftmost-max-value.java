import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int result = 0;
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        while(n != 0){
            for (int i = n-1; i >= 0; i--) {
                if(max < arr[i] || max == arr[i]){
                    n = i;
                    max = arr[i];
                }
            }
            max = 0;
            System.out.print((n+1)+" ");
        }

        
    }
}