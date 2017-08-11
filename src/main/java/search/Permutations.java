package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/6/20 0020.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        List<Integer> numsList = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; ++i) {
            numsList.add(nums[i]);
        }
        return null;
        //dfs()
    }

    public void dfs(List<List<Integer>> result, List<Integer> cur, List<Integer> numsList) {
        //说明数字全放进去了
        if(numsList.size() == 0) {
            result.add(new ArrayList<Integer>(cur));
            return;
        }

    }
}
