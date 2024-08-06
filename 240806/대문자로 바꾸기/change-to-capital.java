import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] arr2d = new String[5][3];
        String lowercase = "";
        String s = "";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                lowercase = sc.next();
                s = lowercase.toUpperCase();
                arr2d[i][j] = s;
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}