package algorithm;

import java.util.*;

/**
 * Created by Administrator on 2016/6/12 0012.
 */
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        // 创建HashMap 存储频率
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; ++i) {
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0)+1);
        }
        // 创建排序的桶，桶的序号是出现的次数。
        List<Integer>[] bucket = new List[nums.length + 1];
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if(bucket[entry.getValue()] == null) {
                bucket[entry.getValue()] = new ArrayList<Integer>();
            }
            bucket[entry.getValue()].add(entry.getKey());
        }

        List<Integer> res = new ArrayList<Integer>();

        int size = 0;
        for(int i = nums.length; i > 0; i--) {
            if(bucket[i] != null ) { //当前桶不空，还是装数字
                //当前已经装的，加上这个桶里的，还是比k少，就全装进去
                if(size + bucket[i].size() <= k) {
                    res.addAll(bucket[i]);
                    size += bucket[i].size();
                }
                else {
                    //加起来比k大了，那只装几个。
                    for(int j = 0; j< k - size; ++j)
                        res.add(bucket[i].get(j));
                }
                if(size == k)
                    break;
            }
        }
        return res;
    }
}
