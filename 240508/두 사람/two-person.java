import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        String d = sc.next();
        
        if(a >= 19 && b.equals("M")){
            System.out.print(1);
        }else if(c >= 19 && d.equals("M")){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}