package search;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class CombinationSum_3_216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        if(k < 1 || n < 1 || k>n)
            return res;
        dfs(res, cur, 0, k, n, 1);
        return res;
    }

    /**
     * dfs递归
     * @param result 最终返回的结果
     * @param cur dfs到当前这步骤，已经加了哪些数字
     * @param sum cur中数字的和
     * @param k 还能用几个数字
     * @param n 原始的需要的和
     * @param level 从1-9，下个数字的起始位置。
     */
    public void dfs(List<List<Integer>> result, List<Integer> cur, int sum, int k ,int n,int level) {
        //找到的条件，sum == n，并且k == 0；
        if( sum == n && k == 0) {
            result.add(new ArrayList<Integer>(cur));
            return;
        }
        else if(sum > n || k < 0) {
            return;
        }
        for(int i = level; i<=9; ++i) {
            cur.add(i);
            dfs(result, cur, sum + i,k-1,n,i+1);
            cur.remove(cur.size()-1);
        }
    }
}
