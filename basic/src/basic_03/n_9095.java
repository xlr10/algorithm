package basic_03;

import java.util.Scanner;

public class n_9095 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int dp[]=new int[11];  //각 케이스들 담을 배열

        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;

        for(int a=4;a<11;a++){  dp[a]=dp[a-1]+dp[a-2]+dp[a-3];}
        int num=scanner.nextInt();
        while (num-->0){        System.out.println(dp[scanner.nextInt()]);  }
    }
}
