package basic_02;

import java.util.Scanner;

public class n_108020 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNextLine()){
            String input=scanner.nextLine();
            int []output=new int[4];    //lower, upper,  num, space

            for(int a=0;a<input.length();a++){
                int tmp=input.charAt(a);
                if(tmp>=97 && tmp<=122) output[0]++;//lower
                else if(tmp>=65 && tmp<=90) output[1]++;//upper
                else if(tmp>=48 && tmp<=57) output[2]++;  //num
                else if(tmp == 32)  output[3]++;  //space
            }
            System.out.println(output[0]+" "+output[1]+" "+output[2]+" "+output[3]);
        }
    }
}
