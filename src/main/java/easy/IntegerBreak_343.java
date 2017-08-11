package easy;

/**
 * Created by Administrator on 2016/6/12 0012.
 */
public class IntegerBreak_343 {
    public int integerBreak(int n) {
        if(n == 2)
            return  1;
        if(n == 3)
            return 2;
        int res = 1;
        while(n > 4) {
            res *= 3;
            n -= 3;
        }
        res *= n;
        return res;
    }
}
