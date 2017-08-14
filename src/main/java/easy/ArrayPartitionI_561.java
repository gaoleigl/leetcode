package easy;

import java.util.Arrays;

/**
 * Created by GL on 2017/8/14.
 * 简单题，把2n个数字组成n个对，然后sum(min(a,b)) 排序以后拿奇数位置的和就行了。
 */
public class ArrayPartitionI_561 {
    public int arrayPairSum(int[] nums) {

        int res = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i += 2) {
            res += nums[i];
        }
        return res;
    }
}
