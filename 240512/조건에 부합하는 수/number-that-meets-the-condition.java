import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i <= a; i++){
            if(i%2==0 && i%4!=0)
                continue;
            if(i%7 < 4)
                continue;
            if(i/8==0 || i/8==2 || i/8==4 || i/8==6 || i/8==8)
                continue;
            System.out.print(i+" ");
        }
    }
}