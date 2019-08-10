package shell_sort;

import algorithm_Templete.algorithm_Templete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shell_sort<T> extends algorithm_Templete {

    public shell_sort(int cnt, int bound) {
        print_templete("Shell Sort");
        this.cnt=cnt;
        this.bound=bound;
    }


    @Override
    public void algorithm() {
        List<T> target = make_list(cnt, bound);
//        int gap;
//
//        //인덱스로만 움직이기..
//        for(gap=cnt/2; gap>0; gap/=2){
//            if(gap%2==0)    gap++;
//            ArrayList<Integer> index_arr=new ArrayList<>();
//
//            //idex 만들기
//            for (int a = 0, index = 0; a < gap; a++) {
//                for (int b = 0; b < cnt; b++) {
//                    if ((b % gap) == a) {
//                        if (index >= cnt) index = a;
//                        //System.out.println(index);
//                        index_arr.add(index);
//                        index += gap;
//                    }
//                }
//                //insert_sort here
//                insert_sort_by_index(target, index_arr);
//            }
//        }

        //예제
        int []test=new int[cnt];
        for(int a=0;a<target.size();a++){
            test[a]=(Integer)target.get(a);
        }

        shell_sort(test,cnt);

        System.out.println("Atfer sort");
        //print_target(target);

        for(int a : test){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    //인덱스-> targer으로 역 추적
    private void insert_sort_by_index(List target, ArrayList<Integer> index){
        for(int a=1;a<index.size();a++){
            for(int b=0;b<a;b++){
                if((Integer)target.get(index.get(b)) > (Integer)target.get(index.get(a))){
                    Collections.swap(target,index.get(b),index.get(a));
                }
            }
        }

    }


    void shell_sort(int list[], int n){
        int i, gap;

        for(gap=n/2; gap>0; gap=gap/2){
            if((gap%2) == 0)
                    gap++; // gap을 홀수로 만든다.


            // 부분 리스트의 개수는 gap과 같다.
            for(i=0; i<gap; i++){
                // 부분 리스트에 대한 삽입 정렬 수행
                inc_insertion_sort(list, i, n-1, gap);
            }
        }
    }
    void inc_insertion_sort(int list[], int first, int last, int gap){
        int i, j, key;

        for(i=first+gap; i<=last; i=i+gap){
            key = list[i]; // 현재 삽입될 숫자인 i번째 정수를 key 변수로 복사

            // 현재 정렬된 배열은 i-gap까지이므로 i-gap번째부터 역순으로 조사한다.
            // j 값은 first 이상이어야 하고
            // key 값보다 정렬된 배열에 있는 값이 크면 j번째를 j+gap번째로 이동
            for(j=i-gap; j>=first && list[j]>key; j=j-gap){
                list[j+gap] = list[j]; // 레코드를 gap만큼 오른쪽으로 이동
            }

            list[j+gap] = key;
        }
    }
}
