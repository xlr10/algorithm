package algorithm_Templete;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class algorithm_Templete<T extends Number> {

    public void print_target(List<T> list) {
        for (T a : list) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    protected void print_templete(String name) {
        System.out.println(">>>> " + name + " (ascending order)");
    }

    public ArrayList<Object> make_list(int cnt, int bound) {

        ArrayList<Object> tmp = new ArrayList<Object>();
        Random random = new Random();

        for (int a = 0; a < cnt; a++) {
            tmp.add((Object) random.nextInt(bound));
        }
        return tmp;
    }

    public void run(int cnt, int bound) {
    }

    public void running_time() {
        long start = System.currentTimeMillis();  //시작시간
        long end = System.currentTimeMillis();  //종료시간
        System.out.println("running time: " + (long) (end - start) / 1000.0 + "s");
    }


}
