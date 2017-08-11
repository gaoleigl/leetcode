package dp;

/**
 * Created by Administrator on 2016/6/16 0016.
 */
public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = sum;
        for(int i = 1;i < nums.length; ++i) {
            sum = Math.max(nums[i], sum + nums[i]);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
