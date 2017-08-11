package algorithm;

/**
 * Created by Administrator on 2016/6/7 0007.
 * 从0到num之间的数字中有多少个1
 */
public class CountingBits_338 {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        if(num == 0)
            return res;
        res[0] = 0;
        res[1] = 1;
        for(int i = 0; i <= num; ++i) {
            res[i] = res[i/2] + res[i%2];
        }
        return res;
    }
}
