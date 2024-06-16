//You are given a 3-digit number n, Find whether it is an Armstrong number or not.

class Solution {
    static String armstrongNumber(int n) {
        // code here
        int sum = 0;
        int temp = n;
        while(temp>0){
            int r = temp%10;
            sum = sum + (int)Math.pow(r,3);
            temp = temp/10;
        }
        if(sum==n){
            return "true";
        }
        return "false";
    }
}
