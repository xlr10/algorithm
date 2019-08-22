package basic_03;

import java.util.Scanner;

public class n_11726 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int dp[]=new int[1001];
        dp[0]= dp[1]=1;

        for(int a=2;a<=num;a++){
            dp[a]=dp[a-1]+dp[a-2];
            dp[a]%=10007;
        }
        System.out.println(dp[num]);
    }
}
