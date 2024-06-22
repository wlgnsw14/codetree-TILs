import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 65;


        for(int i = 0; i < a; i++){
            for(int j = 0; j < 1+i; j++){
                if(cnt == 91){
                    cnt = 65;
                    System.out.print((char)(cnt));
                    cnt++;
                }else{
                    System.out.print((char)(cnt));
                    cnt++;
                }
                
            }
            System.out.println();
        }
    }
}