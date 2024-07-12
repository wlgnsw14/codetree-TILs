import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        int cnt = 0;
        int ap = 0;

        while(true){
            if(cnt == 2){
                break;
            }else{
                arr[ap] = n * (ap + 1);
                if(arr[ap]%5==0){
                    cnt++;
                }
                System.out.print(arr[ap]+" ");
                ap++;
            }
        }
        
    }
}