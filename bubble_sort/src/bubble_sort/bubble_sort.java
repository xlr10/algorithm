package bubble_sort;

import algorithm_Templete.algorithm_Templete;

import java.util.Collections;
import java.util.List;

public class bubble_sort<T> extends algorithm_Templete {

    public bubble_sort() {
        print_templete("Bubble Sort");
    }

    @Override
    public void run(int cnt, int bound) {
        List<T> target = make_list(cnt, bound);
        System.out.println("Before sort");
        print_target(target);

        for (int a = 0; a < target.size(); a++) {
            for (int b = 1; b < target.size() - a; b++) {
                if ((Integer) target.get(b) < (Integer) target.get(b - 1)) Collections.swap(target, b, b - 1);
            }
        }

        System.out.println("Atfer sort");
        print_target(target);
        System.out.println();
    }
}
