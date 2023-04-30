import java.util.*;

public class Indivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 1){
                System.out.println(1);

            }else if (n % 2 == 0){
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i<= n ; i+= 2){
                    sb.append((i+1) + " " + i + " ");

                }
                System.out.println(sb.toString());

            }else{System.out.println(-1);}

   




        }

    }
}