import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int c = 0;
        int d = 0;

        for(int i = 1; i <= a; i++){
            if(i%12==0){
                d++;
            }else if(i%3==0){
                c++;
            }else if(i%2==0){
                b++;
            }
        }
        System.out.println(b+" "+c+" "+d);
    }
}