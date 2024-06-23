import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for (int i = 0; i < a; i++) {
            int cnt = 0;
            int b = sc.nextInt();

            while(true){
                if(b == 1){
                    System.out.println(cnt);
                    break;
                }else{
                    if(b%2==0){
                        b /= 2;
                    }else{
                        b = b * 3 + 1;
                    }
                    cnt++;
                }
            }

            
        }
    }
}