import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a < 0){
            System.out.print("ice");   
        }else if(a >= 100){
            System.out.print("vapor");
        }else{
            System.out.print("water");
        }
    }
}