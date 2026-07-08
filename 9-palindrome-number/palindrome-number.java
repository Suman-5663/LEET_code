class Solution {
    public boolean isPalindrome(int x) {
        int new_num=0;
        int original = x;
        while(x > 0){
            int num = x %10;
            x/=10;
            new_num = new_num*10+num;
        }
        return original == new_num;
    }
}