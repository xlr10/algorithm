package basic_02;

import java.util.Scanner;

public class n_10809 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int cnt[]=new int[26];

        for(int a=0;a<cnt.length;a++)
            cnt[a]=-1;

        for(int a=0;a<input.length();a++){
            int index=input.charAt(a)-'a';
            if(cnt[index] == -1)  cnt[index]=a;
        }
        for(int a : cnt)
            System.out.print(a+" ");
        System.out.println();
    }
}
