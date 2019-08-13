package basic_02;

import java.util.Scanner;

public class n_10824 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s[]=scanner.nextLine().split(" ");
        s[0]+=s[1];
        s[2]+=s[3];

        long input[]={Long.valueOf(s[0]),Long.valueOf(s[2])};   //자료형
        System.out.println(input[0]+input[1]);
    }
}
