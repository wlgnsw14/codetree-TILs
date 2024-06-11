import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b - a + 1;

        for (int i = 1; i <= 9; i++) {
            if(i % 2 == 0){
                for (int j = 1; j <= c; j++) {
                    System.out.print((b - (j-1)) + " * " + i + " = " + ((b - (j-1)) * i));
                    if(j < c){
                        System.out.print(" / ");
                    }
                }
                System.out.println();
            }
            
        }
    }
}