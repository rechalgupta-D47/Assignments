//Two integers n and k are given. Our task is to print K-rounding of n. K-rounding is the minimum positive integer X, such that x ends with k or more zeros and is divisible by n.

class Solution {
    static long ktrailingzeroes(long n , long k) {
        // code here
        long k_trail = (long)Math.pow(10, k);
        long r = n%k_trail;
        long temp_k = k_trail;
        long temp_n = n;
        while(r>0){
            n = k_trail;
            k_trail = r;
            r = n%k_trail;
        }
        long lcm = (temp_n*temp_k)/k_trail;
        return lcm;
    }
};
