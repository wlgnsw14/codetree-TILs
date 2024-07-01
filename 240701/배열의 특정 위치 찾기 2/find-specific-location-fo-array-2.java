import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;

        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                odd += sc.nextInt();
            }else{
                even += sc.nextInt();
            }
        }
        if(even > odd){
            System.out.print(even - odd);
        }else{
            System.out.print(odd - even);
        }
    }
}