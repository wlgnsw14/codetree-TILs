import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String aa = sc.next();
        int a = sc.nextInt();
        String bb = sc.next();
        int b = sc.nextInt();
        String cc = sc.next();
        int c = sc.nextInt();
        int cnt = 0;

        if(aa.equals("Y")){
            if(a >= 37){
                cnt ++;
            }
        }
        
        if(bb.equals("Y")){
            if(b >= 37){
                cnt ++;
            }
        }
        
        if(cc.equals("Y")){
            if(c >= 37){
                cnt ++;
            }
        }

        if(cnt >= 2){
            System.out.print("E");
        }else{
            System.out.print("N");
        }
    }
}