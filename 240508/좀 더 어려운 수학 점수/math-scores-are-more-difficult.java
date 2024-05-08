import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if(a > c){
            System.out.print("A");
        }else if(c > a){
            System.out.print("B");
        }else if(a == c && b > d){
            System.out.print("A");
        }else if(a == c && d > b){
            System.out.print("B");
        }
    }
}