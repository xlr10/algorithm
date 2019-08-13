package basic_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class n_11656 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        List<String> tmp=new ArrayList<>();

        for(int a=0;a<input.length();a++){
            tmp.add(input.substring(a,input.length()));
        }
        Collections.sort(tmp);
        for(String a : tmp){
            System.out.println(a);
        }
    }
}
