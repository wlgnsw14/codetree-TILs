import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i <= a; i++){
            int b = sc.nextInt();

            if(b%2==1 && b%3==0){
                System.out.println(b);
            }
        }
    }
}