import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for (int i = 1; i <= a; i++) {
            int cnt = 0;
            for(int j = 1; j <= i; j++){
                if(i%j==0){
                    cnt ++;
                }
            }

            if(cnt == 2){
                System.out.print(i+" ");
            }
        }
        
    }
}