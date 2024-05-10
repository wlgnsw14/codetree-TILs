import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        int c = 3;

        while(c <= a){
            System.out.print(c+" ");
            b++;
            c = b*3;
        }
    }
}