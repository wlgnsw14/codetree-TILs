import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;
        while(true){
            int a = sc.nextInt();
            if(a>=30){
                System.out.printf("%.2f",(double) sum/cnt);
                break;
            }
            sum += a;
            cnt++;
        }
    }
}