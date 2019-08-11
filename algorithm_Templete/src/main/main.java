package main;

import bubble_sort.bubble_sort;
import insert_sort.insert_sort;
import merge_sort.merge_sort;
import quick_sort.quick_sort;
import selection_sort.selection_sort;
import shell_sort.shell_sort;

import java.util.Arrays;
import java.util.Random;


public class main {
    public static void main(String[] args) {
        System.out.println();
        //입력받기

        int cnt=10;
        int bound=100;


        selection_sort<Integer> select=new selection_sort<Integer>(cnt,bound);
        select.run();
        System.out.println();


        bubble_sort<Integer> bubble=new bubble_sort<Integer>(cnt,bound);
        bubble.run();
        System.out.println();


        insert_sort<Integer> insert=new insert_sort<Integer>(cnt,bound);
        insert.run();
        System.out.println();


        merge_sort merge =new merge_sort(cnt,bound);
        merge.run();
        System.out.println();


        shell_sort<Integer> shell_sort=new shell_sort<Integer>(cnt,bound);
        shell_sort.run();
        System.out.println();

        quick_sort<Integer> quick_sort=new quick_sort<Integer>(cnt,bound);
        quick_sort.run();
        System.out.println();


    }
}
