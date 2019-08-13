package basic_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class n_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        List<Integer> deque=new LinkedList<>();
        int cnt=Integer.parseInt(bufferedReader.readLine());

        while (cnt-- > 0){
            String cmd[]=bufferedReader.readLine().split(" ");

            switch (cmd[0]){
                case "push_front":
                    deque.add(0,Integer.parseInt(cmd[1]));
                    break;
                case "push_back":
                    deque.add(Integer.parseInt(cmd[1]));
                    break;
                case "pop_front":
                    if(deque.isEmpty()) System.out.println(-1);
                    else {
                        System.out.println(deque.get(0));
                        deque.remove(0);
                    }
                    break;
                case "pop_back":
                    if(deque.isEmpty()) System.out.println(-1);
                    else {
                        System.out.println(deque.get(deque.size()-1));
                        deque.remove(deque.size()-1);
                    }
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    if(deque.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                        break;
                case "front":
                    if(deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.get(0));
                        break;
                case "back":
                    if(deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.get(deque.size()-1));
                    break;
            }
        }
    }
}
