import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] countArr = new int[11];

        for (int i = 0; i < 100; i++) {
            int n = sc.nextInt();
            if(n == 0){
                break;
            }else{
                countArr[n / 10]++;
            }
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i + "0 - " + countArr[i]);
        }
    }
}