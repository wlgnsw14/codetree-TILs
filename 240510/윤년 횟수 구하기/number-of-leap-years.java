import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;

        for(int i = 1; i <= a; i++){
            if(i%4==0){
                if(i%100==0 && i%400!=0){
                    cnt--;
                }
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}