import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int result = 0;
        int cnt = 0;

        for(int i = 1; i <= 5; i++){
            int a = sc.nextInt();

            if(a%3==0){
                cnt++;
            }
        }
        if(cnt == 5){
            result = 1;
        }
        System.out.print(result);
        
    }
}