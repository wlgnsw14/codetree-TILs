import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a == 2){
            System.out.print(28);
        }else{
            if(a == 4 || a == 6 || a == 9 || a == 11){
                System.out.print(30);
            }else{
                System.out.print(31);
            }
        }
    }
}