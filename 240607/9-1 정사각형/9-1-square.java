import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 9;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(cnt);
                if(cnt == 1){
                    cnt = 9;
                }else{
                    cnt-- ;
                } 
            }
            System.out.println();
        }
    }
}