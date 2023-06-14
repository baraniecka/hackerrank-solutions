package org.baraniecka.week3.exercise_5_zig_zag;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagSequence {

    public static void main (String[] args) throws java.lang.Exception {
        int num = 7;
        int[] arr = {1,2,3,4,5,6,7};
  findZigZagSequence(arr, num);
    }

    //the goal is to make at least 3 changes to achieve a Zig Zag sequence
    // -> given 1, 2, 3, 4, 5, 6, 7 is a Zig Zag sequence when 1 2 3 7 6 5 4
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n)/2; //before: int mid = (n + 1)/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2; //before: int ed = n - 1;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1; //before: ed = ed + 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
