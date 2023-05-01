import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class WeirdSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--> 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i< n; i++){
                arr[i] = sc.nextInt();
            }
            int[] p = new int[n];
            
            for (int i = 0; i<m ; i++){
                int pos = sc.nextInt();
                p[pos-1] = 1;
            }
            while (true){
                boolean ok = false;
                for (int i = 0; i<n-1; i++){
                    if (p[i] == 1 && arr[i] > arr[i+1]){
                        ok = true;
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }

                }
                if (!ok){break;}

            }
            boolean ok = true;
            for (int i = 0; i< n-1; i++){
                if (arr[i] > arr[i+1]){
                    ok = false;
                    break;
                }
            }
            System.out.println(ok?"YES":"NO");



            
        }
    }
    
}
