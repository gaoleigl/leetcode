package common;

/**
 * Created by Administrator on 2016/6/8 0008.
 */
public class SingleNumber111_260 {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int num = 0;
        for(int i = 0; i < nums.length; ++i) {
            num ^= nums[i];
        }
        int seperator = num & ~(num-1);
        for(int i = 0; i < nums.length; ++i) {
            if((nums[i] & seperator) != 0)
                res[0] = res[0] ^ nums[i];
            else
                res[1] = res[1] ^ nums[i];
        }
        return res;
    }
}
