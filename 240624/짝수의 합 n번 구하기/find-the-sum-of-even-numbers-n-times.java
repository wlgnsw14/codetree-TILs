import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = 0;

            for(int j = b; j <= c; j++){
                if(j%2==0){
                    sum += j;
                }
            }

            System.out.println(sum);
        }
        
    }
}