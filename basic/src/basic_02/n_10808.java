package basic_02;

import java.util.Scanner;

public class n_10808 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int []cnt=new int[26];

        for(int a=0;a<input.length();a++){
            cnt[input.charAt(a)-'a']++;
        }
        for(int a=0; a<cnt.length;a++){
            System.out.print(cnt[a]+" ");
        }
        System.out.println();
    }
}
