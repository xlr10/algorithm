package insert_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class insert_sort {
    public static void main(String[] args) {

        List<Integer> target=make_list(10,100);
        print_target(target);


        for(int a=1;a<target.size();a++){
            for(int b=0;b<a;b++){
                // 5 6 7 8
                if(target.get(b)>target.get(a)){
                    int tmp = target.get(a);
                    target.remove(a);
                    target.add(b,tmp);
                }
            }
        }

        print_target(target);


    }


    public static void print_target(List<Integer> list) {
        for (int a : list) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> make_list(int cnt, int bound) {

        ArrayList<Integer> tmp = new ArrayList<Integer>();
        Random random = new Random();

        for (int a = 0; a < cnt; a++) {
            tmp.add(random.nextInt(bound));
        }
        return tmp;
    }

}
