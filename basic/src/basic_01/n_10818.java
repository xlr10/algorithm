package basic_01;

import java.util.Scanner;

public class n_10818 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();
        int tmp[]=new int[cnt];
        int max=-1000000;
        int min=1000000;

        for(int a=0;a<cnt;a++){
            tmp[a]=scanner.nextInt();
            if(max<tmp[a])  max=tmp[a];
            if(min>tmp[a])  min=tmp[a];
        }
        System.out.println(min+" "+max);
    }
}
