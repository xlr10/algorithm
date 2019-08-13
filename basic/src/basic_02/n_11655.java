package basic_02;

import java.util.Scanner;

public class n_11655 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char output[]=scanner.nextLine().toCharArray();

        for(int a=0;a<output.length;a++){            
            if(output[a]>=65 && output[a]<=90){
                output[a]+=13;
                if(output[a]>90)    output[a]=(char)(output[a]%90+64);

            }else if(output[a]>=97 && output[a]<=122){
                output[a]+=13;
                if(output[a]>122)   output[a]=(char)(output[a]%122+96);
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        for(char a : output){
            stringBuilder.append(a);
        }
        System.out.println(stringBuilder);
    }
}
