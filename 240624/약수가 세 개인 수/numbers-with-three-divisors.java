import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        
        for (int i = a; i <= b; i++) {
            int cnt = 0;

            for(int j = 1; j <= i; j++){
                if(i%j==0){
                    cnt ++;
                }
            }
            
            if(cnt == 3){
                result++;
            }
        }
        System.out.println(result);
    }
}