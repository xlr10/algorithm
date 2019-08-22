package basic_03;

import java.util.Scanner;

public class n_1463 {
    static int dp[];

    public static void main(String[] args) {
        //dp[n]=min(dp[n/3]+1, dp[n/2]+1, dp[n-1]+1)
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        dp=new int[num+1];

        System.out.println(make_one(num));

    }

    //top-down
    public static int make_one(int num) {
        dp[0]=dp[1]=0;

        for(int a=2; a<=num; a++){
            dp[a]=dp[a-1]+1;
            if(a%3==0 && dp[a]>dp[a/3]+1)  dp[a]=Math.min(dp[a/3]+1,dp[a]);
            if(a%2==0 && dp[a]>dp[a/2]+1)  dp[a]=Math.min(dp[a/2]+1,dp[a]);
        }
        return dp[num];
    }

    //bottom-up
//    public static int make_one(int num) {
//        if (num == 1) return 0;
//        if(dp[num]>0) return dp[num];
//
//        dp[num]=make_one(num-1)+1;
//
//        if (num % 3 == 0) {
//            int tmp=make_one(num/3)+1;
//            dp[num]=Math.min(dp[num],tmp);
//        }
//        if (num % 2 == 0) {
//            int tmp=make_one(num/2)+1;
//            dp[num]=Math.min(dp[num],tmp);
//        }
//
//        return dp[num];
//    }
}
