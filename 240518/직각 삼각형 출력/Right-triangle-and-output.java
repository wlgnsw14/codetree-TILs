import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;

        for(int i = a; i >= 1; i--){
            for(int j = i; j <= a+(a-i); j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}