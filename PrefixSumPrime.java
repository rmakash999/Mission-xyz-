import java.util.Scanner;

public class PrefixSumPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i< n; i++){
            int x = sc.nextInt();
            if (x == 2){
                cnt2++;
            }else {
                cnt1++;
            }
        }
        StringBuilder sb = new StringBuilder();
        long sum = 0;
        if (cnt2 > 0){
            sb.append(2);
            cnt2--;
        }

        while (cnt1 > 0 && cnt2 > 0){
            if ((sum + 1) % 2  == 1){
                sb.append(1 + " ");
                sum += 1;
                cnt1--;
            }else{
                sb.append(2 + " ");
                sum += 2;
                cnt2--;
            }
            
        }
        if (cnt1 > 0){
            while (cnt1 > 0){
                sb.append(1 + " ");
                cnt1--;
            }
        }else{
            while (cnt2 > 0){
                sb.append(2 + " ");
                cnt2--;
            }
        }
        System.out.println(sb.toString());

    }
    
}
