import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        String d = sc.next();
        
        System.out.print((a >= 19 || c >= 19) && (b.equals("M") || d.equals("M")) ? 1 : 0);
    }
}