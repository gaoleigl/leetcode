package algorithm;

/**
 * Created by Administrator on 2016/6/15 0015.
 */
public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int low = 0,high = nums.length -1,mid= 0;
        while (low < high) {
            mid = low + (high - low) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target)
                low = mid + 1;
            else
                high = mid;
        }
        if(target > nums[low])
            return low + 1;
        else
            return low;
    }
}
