package heap_sort;

import algorithm_Templete.algorithm_Templete;

import java.util.List;

public class heap_sort <T> extends algorithm_Templete{

    public heap_sort(int cnt, int bound){
        this.cnt=cnt;
        this.bound=bound;
        print_templete("Heap Sort");
    }

    @Override
    public void algorithm() {
        //here
        //1. heap 은 배열로 구성됨 / 배열 첫번째 index는 사용 안함
        //2. heap 추가
        //3. heap 삭제

        int target[] = make_heap_ascending(make_list(cnt, bound));
        print_arr(target);

        print_heap_ascending(target);

        System.out.println("Atfer sort");
        print_arr(target);
    }


    private int[] make_heap_ascending(List<Integer> target){
        int []tmp=new int[cnt+1];   //index:0 not use

        for(int a=1,index=0;a<cnt+1;a++){
            tmp[a]=target.get(a-1);
            index=a;
            //exchange 알고리즘
            while (index>1){
                if(tmp[index/2] > tmp[index]) {
                    swap_arr(tmp, index / 2, index);    //부모랑 교환
                    index/=2;
                }else{  break;}
            }
        }
        return tmp;
    }
    private void print_heap_ascending(int[] target){  //root 삭제후 마지막 노드 삽입
        int []tmp=new int[cnt];

        for(int index=1, end=cnt;index<cnt+1;index++){
            tmp[index-1]=target[1];
            target[1]=0;
            swap_arr(target,1,end--);

            //마지막 노드를 root로 이동후 재정렬
            for(int a=2,now=1;a<=end ;a*=2){
                if(target[a+1]!=0){
                    if(target[a] < target[a+1]) {
                        if(target[now] >target[a]){
                            swap_arr(target,now,a);
                            now=a;
                        }else  break;
                    }else{
                        if(target[now] > target[a+1]){
                            swap_arr(target,now,a+1);
                            now=a+1;
                            a++;
                        }else  break;
                    }
                }
            }
        }
        if(tmp[cnt-1]<tmp[cnt-2])   swap_arr(tmp,cnt-1,cnt-2);

        for(int a=0;a<cnt;a++){target[a]=tmp[a];}
    }

    private void swap_arr(int[] arr,int from,int to){
        int tmp_index=arr[from];
        arr[from]=arr[to];
        arr[to]=tmp_index;
    }
    private void print_arr(int[] arr){
        for(int a: arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }

}
