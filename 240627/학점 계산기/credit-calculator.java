import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] arr = new double[100];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        
        if(sum/n >= 4){
            System.out.printf("%.1f\n" ,sum/n);
            System.out.println("Perfect");
        }else if(sum/n >= 3){
            System.out.printf("%.1f\n", sum/n);
            System.out.println("Good");
        }else{
            System.out.printf("%.1f\n", sum/n);
            System.out.println("Poor");
        }
    }
}