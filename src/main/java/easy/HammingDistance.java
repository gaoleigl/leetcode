package easy;

/**
 * Created by GL on 2017/8/11.
 * 两个数字的不同位数的个数
 */
public class HammingDistance {
    /**
     * 异或再求1的个数，通过每次去掉最后一个1
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int cnt = 0;
        for (; xor != 0; ++ cnt) {
            // 每次把最后一个消灭
            xor &= (xor -1);
        }
        return cnt;
    }

    /**
     * 用Java 的API
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance2(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
