// Time Complexity : O(log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

class RotatedSortedArrayMin {
    public int findMin(int[] nums) {
       int low=0, high = nums.length - 1;
       while(low <= high) {
         // if the rotated array is sorted, then it is the first element.
        if(nums[low] <= nums[high]) {
            return nums[low];
        }
        int mid = low + (high - low)/2;
        if((mid == 0 || nums[mid] < nums[mid - 1]) && (mid == nums.length - 1 || nums[mid] < nums[mid + 1])){
            return nums[mid];
        }
        else if(nums[low] <= nums[mid]) { //left sorted
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
       }

        return 3434;
    }
}