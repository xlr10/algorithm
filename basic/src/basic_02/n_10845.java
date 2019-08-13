package basic_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class n_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        List<Integer> queue=new LinkedList<>();
        int cnt=Integer.parseInt(bufferedReader.readLine());

        while (cnt-- > 0){    //새로운 표현 =>>> (cnt--) > 0 반대 : cnt++<10 등등
            String cmd[]=bufferedReader.readLine().split(" ");

            switch (cmd[0]){
                case "push":
                    queue.add(Integer.valueOf(cmd[1]));
                    break;
                case "pop":
                    if(queue.isEmpty()) System.out.println(-1);
                    else{
                        System.out.println(queue.get(0));
                        queue.remove(0);
                    }
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if(queue.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "front":
                    if(queue.isEmpty()) System.out.println(-1);
                    else System.out.println(queue.get(0));
                    break;
                case "back":
                    if(queue.isEmpty()) System.out.println(-1);
                    else System.out.println(queue.get(queue.size()-1));
                    break;
            }
        }
    }
}
