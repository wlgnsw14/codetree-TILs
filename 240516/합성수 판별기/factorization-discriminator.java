import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result = "N";

        for(int i = 2; i <= a-1; i++){
            if(a%i==0){
                result = "C";
            }
        }

        System.out.print(result);
    }
}