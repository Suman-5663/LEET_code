class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;
        int i=n-1;
        while(s.charAt(i)==' ') i--;
        while(s.charAt(i)!=' ' && i>0){
            count ++;
            i--;}
        if (i==0 && s.charAt(0)!= ' ') return count+1;
        return count;
    }
}