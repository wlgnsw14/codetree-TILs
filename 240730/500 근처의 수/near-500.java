import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int max = 0;
        int min = 1000;
        
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] > 500 && min > arr[i]){
                min = arr[i];
            }
            if(arr[i] < 500 && max < arr[i]){
                max = arr[i];
            }
        }
        System.out.print(max+" "+min);
    }
}