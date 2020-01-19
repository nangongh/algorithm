package cn.leetcode.algorithm.array;

public class lesson3 {

    public static  void merge(int[] a,int m,int[] b,int n){
        int i=m-1,j=n-1,k=m+n-1;
        while(k>=0 && j>=0){
            if(i>=0 && a[i]>=b[j]){
                a[k]=a[i];
                a[i]=0;i--;
            }
            else{
                a[k]=b[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[] a={7,8,9,0,0,0};
        int[] b={2,5,6};
        int m=3,n=3;
        merge(a,m,b,n);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
