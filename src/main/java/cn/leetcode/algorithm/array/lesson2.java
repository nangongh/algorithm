package cn.leetcode.algorithm.array;

public class lesson2 {
        public static int solution(int n, int[] nums) {
            int left=1,right=100000;
            int middle=(left+right)/2;
            for(int i=0,len=nums.length;i<len-1;i++){
                if((middle-nums[i])>=0 && (middle-nums[i+1])<0){
                    return Math.max(nums[i]-left, right-nums[i+1]);
                }
            }
            return Math.max(nums[n-1]-left, right-nums[0]);
        }

    public static void main(String[] args) {
            int[] a={2,3,50000,99997,99998,99999};
            int n=6;
        System.out.println(solution(n,a));
    }
}
