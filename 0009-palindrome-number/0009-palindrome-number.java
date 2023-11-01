class Solution {
    public boolean isPalindrome(int x) {
        int a=0;
        int o=x;
        while(x>0){
            int rem=x%10;
            a=a*10+rem;
            x=x/10;
        }
        if(o==a){
            return true;
        }
        return false;
    }
}