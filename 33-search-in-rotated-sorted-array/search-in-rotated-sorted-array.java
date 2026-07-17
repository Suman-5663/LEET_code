class Solution {
    public int search(int[] nums, int target) {
       int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            //in a rotated sorted array one half always sorted so to find the sorted half the beloiw only if condition
            // it doest not work for if nums[left] == nums[right] == nums[mid]
            //for the above case 
            if(nums[mid] == nums[left] && nums[mid] == nums[right]){
                left++;
                right--;
                continue;
            }
             //the above block of code because to shrink the array if left = mid = right;
            if(nums[left] <= nums[mid]){
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid +1;
                }
            }
            else{
                if(target > nums[mid] && target <= nums[right]){
                    left = mid +1;
                }
                else{
                    right = mid -1;
                }
            }
        }
        return -1; 
    }
}