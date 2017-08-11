package algorithm;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class UniquePaths_62 {
    public static int uniquePaths(int m, int n) {
        m--;
        n--;
        if(m== 0 || n == 0)
            return 1;
        if(m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        //m是大的
        long res = 1;
        int j = 1;
        for(int i = m+1; i <= m+n; i++,j++) {
            res *= i;
            res /= j;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }

}
