//Given two numbers A and B. The task is to find out their LCM and GCD.

class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long temp_A = A;
        Long temp_B = B;
        Long r = A%B;
        while(r!=0){
            A=B;
            B=r;
            r = A%B;
        }
        Long[] ans = new Long[2];
        ans[1] = B;
        ans[0] = (temp_A*temp_B)/ans[1];
        return ans;
    }
};
