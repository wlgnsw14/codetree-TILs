import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int cnt = 0;
        int result = 0;

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < a; i++) {
            if(cnt == 3){
                break;
            }else{
                if(arr[i] == 2){
                    result = i;
                    cnt++;
                }
            }
        }

        System.out.print(result+1);
    }
}