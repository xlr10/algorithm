package selection_sort;

import algorithm_Templete.algorithm_Templete;

import java.util.Collections;
import java.util.List;

public class selection_sort<T> extends algorithm_Templete {

    public selection_sort() {
        //System.out.println(">>>> Selection Sort (ascending order)");
        print_templete("Selection Sort");
    }

    @Override
    public void run(int cnt, int bound) {
        List<T> target = make_list(cnt, bound);
        System.out.println("Before sort");
        print_target(target);

        for (int a = 0; a < target.size(); a++) {
            for (int b = a; b < target.size(); b++) {
                if ((Integer) target.get(a) > (Integer) target.get(b)) Collections.swap(target, a, b);
            }
        }

        System.out.println("Atfer sort");
        print_target(target);
        System.out.println();
    }
}
