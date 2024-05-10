import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i <= a; i++){
            if(i%3==0){
                System.out.print("0 ");
            }else{
                String b = String.format("%d", i);
                String[] c = b.split("");

                if(c.length == 1){
                    if(c[0].equals("3") || c[0].equals("6") || c[0].equals("9")){
                        System.out.print("0 ");
                    }else{
                        System.out.print(i+" ");
                    }
                }else{
                    if(c[0].equals("3") || c[0].equals("6") || c[0].equals("9") || c[1].equals("3") || c[1].equals("6") || c[1].equals("9")){
                        System.out.print("0 ");
                    }else{
                        System.out.print(i+" ");
                    }
                }

                
            }
        }
    }
}