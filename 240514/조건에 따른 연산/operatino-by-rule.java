import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        
        while(true){
            if(a == 2){
                System.out.print(1+cnt);
                break;
            }
            a /= 2;
            cnt++;
        }
    }
}