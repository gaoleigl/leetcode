package midium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GL on 2017/8/14.
 * 四个同等Size的数组，找出有多少对（i,j,h,k）的下标，值得对应值加起来为0
 * 暴力解法是N^4，思考一下如果是两个数组就很简单了，所以把四个转成两个，然后记录每个值出现的次数
 * 这里的意义是 CDMap转成一个<数字，出现次数>
 */
public class FourSumII_454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        Map<Integer, Integer> CDMap = new HashMap<>();
        for (int c : C) {
            for(int d : D) {
                int sum = c + d;
                CDMap.put(sum, CDMap.getOrDefault(sum, 0) + 1);
            }
        }

        int res  = 0;
        for (int a : A) {
            for(int b : B) {
                int sum = a + b;
                res += CDMap.getOrDefault(-sum, 0);
            }
        }

        return res;
    }
}
