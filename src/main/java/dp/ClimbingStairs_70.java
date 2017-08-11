package dp;

/**
 * Created by Administrator on 2016/6/16 0016.
 */
public class ClimbingStairs_70 {
    public int climbStairs(int n) {
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        int a=1,b=2;
        int ans = 0;
        for(int i =3;i<=n;++i) {
            ans = a+b;
            a=b;
            b=ans;
        }
        return ans;
    }
}
