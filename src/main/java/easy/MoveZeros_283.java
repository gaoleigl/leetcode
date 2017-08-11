package easy;

import com.sun.deploy.util.ArrayUtil;
import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public class MoveZeros_283 {
    public static void moveZeroes(int[] nums) {
        int zeroCnt = 0;
        for(int i = 0 ;i < nums.length; ++i) {
            if(nums[i] == 0)
                zeroCnt ++;
            else
                nums[i-zeroCnt] = nums[i];
        }
        for(int i =nums.length - zeroCnt; i < nums.length ; ++i)
            nums[i] = 0;
    }

    public static void main(String[] args) {
        int[] test = new int[]{0, 1, 0, 3, 12};
        moveZeroes(test);
        System.out.println(Arrays.toString(test));
    }
}
