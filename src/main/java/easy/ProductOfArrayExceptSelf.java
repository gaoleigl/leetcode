package easy;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for(int i =1; i < nums.length; ++i) {
            res[i] = res[i-1] * nums[i-1];
        }
        int right = 1;
        for(int i = nums.length-1 ;i >0; --i) {
            right = right * nums[i];
            res[i-1] = res[i-1] * right;
        }
        return res;
    }
}
