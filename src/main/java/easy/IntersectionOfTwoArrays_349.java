package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public class IntersectionOfTwoArrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> res = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; ++i)
            set1.add(nums1[i]);
        for(int i = 0; i < nums2.length; ++i) {
            if(set1.contains(nums2[i]))
                res.add(nums2[i]);
        }
        int[] resArray = new int[res.size()];
        int index = 0;
        for(Integer i : res)
            resArray[index ++] = i;
        return resArray;
    }
}
