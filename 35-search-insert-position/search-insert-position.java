class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        // if(nums[n-1] == target) return n-1;
        if (target<nums[0]) return 0;
        if (target>nums[n-1]) return n;
        int i=0;
        for(i=0;i<n;i++){
            if(nums[i] == target){
            return i;}
        if(nums[i]< target && nums[i+1] > target){
            return i+1;
        }
        }
        return -1;
    }

}

// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int n = nums.length;
//         if (n == 0) return 0;
//         if (target<nums[0]) return 0;
//         if (target>nums[n-1]) return n;
//         int i=0;
//         while (i<n){
//             if ( i<n-1 && nums[i]<target && nums[i+1]>target) return i+1;
//             if (target==nums[i]) return i;
//             i++;
//         }
//         return 0;
//     }
// }
