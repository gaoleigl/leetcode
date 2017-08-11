package common;

/**
 * Created by Administrator on 2016/6/9 0009.
 */
public class PerfectSquares_279 {
    public static int numSquares(int n) {
        int[] nums = new int[n + 1];
        //初始化数组，因为数字i最多又i个1组成，所以最大就是i
        for(int i = 0; i <= n; ++i)
            nums[i] = i;

        //初始化完美数的值，都为1
        for(int i = 1; i * i <= n; ++i)
            nums[i*i] = 1;

        //利用 x = a + b*b 进行dp
        for(int i = 0; i <= n; ++i){
            for(int j = 0; i + j*j <= n; ++j) {
                //因为nums[i+j*j] 本身就可能是平方数
                nums[i + j*j] = Math.min(nums[i] + 1, nums[i + j*j]);
            }
        }
        return nums[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(6));
    }
}
