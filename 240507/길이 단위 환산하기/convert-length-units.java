import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble() * 30.48;
        System.out.printf("%.1f", a);
    }
}