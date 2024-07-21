import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n+1];

        // 원소
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        // 질문 풀기
        for (int i = 1; i <= q; i++) {
            int qa = sc.nextInt();
            if(qa == 1){
                int a = sc.nextInt();
                System.out.println(arr[a]);
            }else if(qa == 2){
                int b = sc.nextInt();
                int cnt = 0;
                int bb = 0;
                for(int j = n; j >= 1; j--){
                    if(arr[j] == b){
                        bb = j;
                        cnt++;
                    }
                }
                if(cnt == 0){
                    System.out.println(0);
                }else{
                    System.out.println(bb);
                }
            }else{
                int s = sc.nextInt();
                int e = sc.nextInt();
                for (int j = s; j <= e; j++) {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }

    }
}