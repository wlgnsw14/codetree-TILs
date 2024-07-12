import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            if(a == 0){
                break;
            }else{
                if(a%2==0){
                    System.out.print(a/2+" ");
                }else{
                    System.out.print(a+3+" ");
                }
            }
        }
        
    }
}