import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
            if(i%2==0){
                System.out.println("*");
            }else{
                for(int j = 0; j < i + 1; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
}