import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr2d = new int[4][4];
        int n = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr2d[i][j] = sc.nextInt();
                n += arr2d[i][j];
            }
            System.out.println(n);
            n = 0;
        }
    }
}