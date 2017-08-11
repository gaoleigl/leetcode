package algorithm;

/**
 * Created by Administrator on 2016/6/15 0015.
 */
public class FindTheDuplicateNumber_287 {
    public int findDuplicate(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int low = 1, high = nums.length-1,mid;
        while(low < high) {
            mid = low + (high - low) / 2;
            int cnt = 0;
            for(int i = 0 ; i < nums.length; ++i) {
                if(nums[i] <= mid)
                    cnt ++;
            }
            if(cnt > mid)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
}
