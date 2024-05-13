import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while(true){
            if(cnt == 3){
                break;
            }
            int a = sc.nextInt();
            if(a%2==0){
                System.out.println(a/2);
                cnt++;
            }
            
        }
    }
}