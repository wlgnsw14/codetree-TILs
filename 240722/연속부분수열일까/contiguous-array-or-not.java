import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        int[] brr = new int[b];
        int cnt = 0;

        // 원소
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < b; i++) {
            brr[i] = sc.nextInt();
        }

        // 풀기
        for (int i = 0; i < a; i++) {
            if(arr[i] == brr[0]){
                while(true){
                    int n = 1;
                    if(i+n == a){
                        break;
                    }
                    if(arr[i+n] == brr[n]){
                        cnt++;
                        n++;
                    }else{
                        cnt = 0;
                        break;
                    }
                    if(cnt == b){
                        break;
                    }
                }
            }
            if(cnt == b){
                break;
            }
        }
        if(cnt == b){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}