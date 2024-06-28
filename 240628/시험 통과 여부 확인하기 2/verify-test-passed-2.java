import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 0;
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < a; i++) {
            for(int j = 0; j < 4; j++){
                n = sc.nextInt();
                sum += n;
            }
            if(sum/4 >=60){
                System.out.println("pass");
                cnt++;
            }else{
                System.out.println("fail");
            }

            sum = 0;
        }
        System.out.print(cnt);
    }
}