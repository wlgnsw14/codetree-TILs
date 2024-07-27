import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int result = 0;
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    cnt++;
                }
            }
            if(cnt == 1){
                if(result < arr[i]){
                    result = arr[i];
                }
            }else if(cnt == 2){
                cnt = 0;
                continue;
            }
            cnt = 0;
        }
        if(result == 0){
            System.out.println("-1");
        }else{
            System.out.println(result);
        }
        
    }
}