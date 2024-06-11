import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;

        for(int i = a; i <= b; i += 2){
            c++;
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print((b - ((j-1) * 2)) + " * " + i + " = " + ((b - ((j-1) * 2)) * i));
                if(j < c){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}