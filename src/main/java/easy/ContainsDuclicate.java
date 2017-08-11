package easy;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * Created by Administrator on 2016/6/12 0012.
 */
public class ContainsDuclicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length; ++i) {
            if(set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;
    }
}
