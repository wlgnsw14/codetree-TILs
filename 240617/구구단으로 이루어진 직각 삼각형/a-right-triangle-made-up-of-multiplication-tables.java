import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - (i-1); j++) {
                if (j == a - (i-1)) {
                    System.out.println(i + " * " + j + " = " + i*j);
                }
                else {
                    System.out.print(i + " * " + j + " = " + i*j + " / ");
                }
            }
        }
    }
}