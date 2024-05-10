import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int three_cnt = 0;
        int five_cnt = 0;

        for(int i = 1; i <= 10; i++){
            int a = sc.nextInt();

            if(a%3==0){
                three_cnt++;
            }
            if(a%5==0){
                five_cnt++;
            }
        }
        System.out.println(three_cnt+" "+five_cnt);
    }
}