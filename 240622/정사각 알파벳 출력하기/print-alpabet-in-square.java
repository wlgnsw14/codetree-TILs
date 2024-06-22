import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 65;


        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                System.out.print((char)(cnt));
                cnt++;
            }
            System.out.println();
        }
    }
}