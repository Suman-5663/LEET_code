class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        if(k==0){
            return;
        }
        k=n-k;
        int a=n,b=k;
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        int gcd = a;
        for(int i=0;i<gcd;i++){
            int temp = nums[i];
            int current_index = i;
            while(true){
                int next_index = current_index + k;
                if(next_index >= n){
                    next_index-=n; 
                }
                if(next_index==i){
                    break;
                }
                nums[current_index] = nums[next_index];
                current_index = next_index;
            }
            nums[current_index] = temp;
        }
    }
}