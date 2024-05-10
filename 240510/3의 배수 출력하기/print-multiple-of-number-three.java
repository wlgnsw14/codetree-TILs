import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        int c = 0;

        while(c <= a){
            System.out.print((c = b*3)+" ");
            b++;
        }
    }
}