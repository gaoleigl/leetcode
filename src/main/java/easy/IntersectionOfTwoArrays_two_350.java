package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/12 0012.
 */
public class IntersectionOfTwoArrays_two_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> cntMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums1.length; ++i) {
            cntMap.put(nums1[i], cntMap.getOrDefault(nums1[i],0) + 1);
        }
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < nums2.length; ++i) {
            if(cntMap.containsKey(nums2[i]) && cntMap.get(nums2[i])!= 0) {
                res.add(nums2[i]);
                cntMap.put(nums2[i], cntMap.get(nums1[2]) - 1);
            }
        }
        int[] resArr = new int[res.size()];
        for(int i = 0; i < res.size(); ++i) {
            resArr[i] = res.get(i);
        }

        return resArr;
    }
}
