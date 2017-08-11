package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/6/16 0016.
 */
public class HappyNumber_202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while (set.add(n)){
            int sum = 0;
            while(n > 0) {
                int digit = n%10;
                sum += digit * digit;
                n /= 10;
            }
            if(sum == 1)
                return true;
            else
                n = sum;
        }
        return false;
    }
}
