import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result = "C";
        int cnt = 0;

        for(int i = 1; i <= a; i++){
            if(a%i==0){
                cnt++;
            }
        }
        if(cnt == 2){
            result = "P";
        }
        System.out.print(result);
        
    }
}