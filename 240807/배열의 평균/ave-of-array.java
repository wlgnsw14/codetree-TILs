import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2d = new int[2][4];
        double total = 0;
        double row1 = 0;
        double row2 = 0;
        double col1 = 0;
        double col2 = 0;
        double col3 = 0;
        double col4 = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr2d[i][j] = sc.nextInt();
                total += arr2d[i][j];
                if (i == 0) {
                    row1 += arr2d[i][j];
                } else {
                    row2 += arr2d[i][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    col1 += arr2d[i][j];
                } else if (j == 1) {
                    col2 += arr2d[i][j];
                } else if (j == 2) {
                    col3 += arr2d[i][j];
                } else if (j == 3) {
                    col4 += arr2d[i][j];
                }
            }
        }
        System.out.printf("%.1f %.1f%n", row1 / 4.0, row2 / 4.0);
        System.out.printf("%.1f %.1f %.1f %.1f%n", col1 / 2.0, col2 / 2.0, col3 / 2.0, col4 / 2.0);
        System.out.printf("%.1f%n", total / 8.0);
    }
}