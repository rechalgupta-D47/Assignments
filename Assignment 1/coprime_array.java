//Given an array of N elements, find the minimum number of insertions to convert the given array into a co-prime array adjacent pair-wise.

class Solution{
    int countCoPrime(int a[], int n)
    {
        // Complete the function
        int count = 0;
        for(int i=0;i<a.length-1;i++){
            if(gcd(a[i],a[i+1])){
                count++;
            }
        }
        return count;
    }
    boolean gcd(int a,int b){
        int r = a%b;
        while(r>0){
            a = b;
            b = r;
            r = a%b;
        }
        if(b!=1) return true;
        return false;
    }
}
