import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 0; i <= a-1; i++){
            for(int j = 1; j <= (a-i)*(a-i); j++){
                if(j%(a-i)==0){
                    System.out.print("* ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }
}