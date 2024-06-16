//Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.
//You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

class Solution {
    public int[] singleNumber(int[] nums) {
        long p=0;
        for(int i:nums){
            p^=i;
        }
        long check=p & (-p);
        int a=0;
        int b=0;
        for(int i:nums){
            if((i & check)!=0){
                a^=i;
            }else{
                b^=i;
            }
        }
        return new int[]{a,b};
    }
}