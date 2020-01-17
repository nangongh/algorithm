package cn.leetcode.algorithm.array;

import java.util.Arrays;

/**
 *  冒泡排序
 */
public class lesson1 {

    private static int[] bubbleSort(int[] array){
        int len=array.length;
        int temp;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1-i;j++){
                if(array[j]<array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array={2,8,4,6,3,7};
        bubbleSort(array);
        for (int i : array) {
            System.out.print(i+" ");
        }

    }


}
