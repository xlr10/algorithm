package basic_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String s=bufferedReader.readLine();
        int cnt=Integer.parseInt(bufferedReader.readLine());

        Stack<Character> left=new Stack<>();    //커서 기준
        Stack<Character> right=new Stack<>();
        for(int a=0;a<s.length();a++){
            left.push(s.charAt(a));
        }

        for(int a=0;a<cnt;a++){
            String cmd[]=bufferedReader.readLine().split(" ");

            switch (cmd[0]){
                case "L":
                    if(!left.isEmpty()) right.push(left.pop());
                    break;
                case "D":
                    if(!right.isEmpty()) left.push(right.pop());
                    break;
                case "B":
                    if(!left.isEmpty()) left.pop();
                    break;
                case "P":
                    left.push(cmd[1].charAt(0));
                    break;
            }
        }

        while (!left.empty()){
            right.push(left.pop());
        }
        StringBuilder tmp=new StringBuilder();
        while (!right.empty()){
            tmp.append(right.pop());
        }
        System.out.println(tmp);
    }
}

