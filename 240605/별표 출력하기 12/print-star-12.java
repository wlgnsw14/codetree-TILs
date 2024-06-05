import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a == 1){
            for (int i = 0; i < 1; i++) {
            for (int j = 0; j < a; j++) {
                if (j%2==1 && j >= i || i == 0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        }else{
            for (int i = 0; i < a / 2 * 2; i++) {
            for (int j = 0; j < a; j++) {
                if (j%2==1 && j >= i || i == 0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        }

        
    }
}