import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int n = sc.nextInt();

            if(n < 37 && s.equals("N")){
                arr[3]++;
            }else if(n < 37 && s.equals("Y")){
                arr[2]++;
            }else if(n >= 37 && s.equals("N")){
                arr[1]++;
            }else{
                arr[0]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i]+" ");
        }
        if(arr[0] >= 2){
            System.out.print("E");
        }
    }
}