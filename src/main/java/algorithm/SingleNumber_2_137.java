package algorithm;

/**
 * Created by Administrator on 2016/6/15 0015.
 */
public class SingleNumber_2_137 {
    public int singleNumber(int[] nums) {
        int[] bucket = new int[32];
        for(int i = 0; i < nums.length; ++i) {
            int num = nums[i];
            for(int j = 0; j < 32 ;j++) {
                if((num >> j) == 0)
                    break;
                if(((num >> j) & 1) == 1)
                    bucket[j] ++;
            }
        }
        int ans = 0;
        for(int i = 0; i < 32; ++i) {
            if(bucket[i] % 3 != 0){
                ans = ans | (1<<i);
            }
        }
        return ans;
    }
}
