class Solution {
    public boolean isPowerOfTwo(int n) {

        // while(n>0){
        // if(n==1)return true;
        // if(n%2!=0)return false;
        // n/=2;
        // }
        return false;
        return (n > 0 && (n & n - 1) == 0);
    }
}