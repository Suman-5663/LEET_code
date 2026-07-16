class Solution {
    public long sumAndMultiply(int n) {

        int sum = 0; 
        String str = Integer.toString(n);
        int len = str.length();
        StringBuilder s= new StringBuilder();
        for(int i = 0;i < len; i++){
            if(str.charAt(i)!='0'){
                s.append(str.charAt(i));
            }
        }
        int temp =n;
        while(temp > 0){
            int num = temp % 10;
            sum = sum + num;
            temp/=10; 
        }
        long x = s.length() == 0 ? 0 : Long.parseLong(s.toString());
        return (x * sum);
    }
}