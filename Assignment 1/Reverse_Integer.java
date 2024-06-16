//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        if(reverse1(x)>=min && reverse1(x)<=max) return reverse1(x);
        return 0;
    }

    public int reverse1(int x){
        boolean b = false;
        if(x<0){
            b = true;
            x = -x;
        }
        int s = 0;
        while(x>0){
            int r = x%10;
            if(s > (Integer.MAX_VALUE - r)/10 ) return 0;
            s = s*10+r;
            x = x/10;
            
        }
        if(b) return -s;
        return s;
    }
}