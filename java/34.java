public class Solution {
    public int[] searchRange(int[] nums, int target) {
        // pretty detail one
        if(nums == null || nums.length == 0) return new int[]{-1, -1};
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target)right = mid;
            else left = mid + 1;
        }
        if(nums[left] != target) return new int[]{-1, -1};
        int[] rst = new int[]{left, -1};
        right = nums.length;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] <= target) left = mid + 1;
            else right = mid;
        }
        rst[1] = left - 1;
        return rst;
    }
}