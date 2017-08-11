package algorithm;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
public class CountNumbersWithUniqueDigits_357 {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0)
            return 1;
        if(n>10)
            n = 10;
        int res = 0;
        int sum = 10;
        int tmp = 9;
        for(int i = 1; i < n; ++i) {
            tmp *= 10 - i;
            sum += tmp;
        }
        return sum;
    }
}
