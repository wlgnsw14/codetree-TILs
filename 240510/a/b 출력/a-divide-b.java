import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int d = 0;
        int e = a%b;

        System.out.print((a/b)+".");

        for(int i = 0; i <= 19; i++){
            if(a/b >= 1){
                c = (e*10)/b;
                d = (e*10)%b;
                System.out.print(c);
                a = d;
            }else{
                c = (a*10)/b;
                d = (a*10)%b;
                System.out.print(c);
                a = d;
            }
            
        }
    }
}