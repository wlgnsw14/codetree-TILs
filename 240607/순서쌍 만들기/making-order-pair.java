import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = a; i > 0; i--) {
            for (int j = a; j > 0; j--) {
                System.out.print("("+i+","+j+") ");
            }
            System.out.println();
        }
    }
}