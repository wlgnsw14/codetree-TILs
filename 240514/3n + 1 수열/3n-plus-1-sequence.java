import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        
        while(true){
            if(a == 1){
                break;
            }
            if(a%2==0){
                a /= 2;
                cnt++;
            }else{
                a = (a * 3) + 1;
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}