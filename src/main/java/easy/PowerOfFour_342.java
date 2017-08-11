package easy;

/**
 * Created by Administrator on 2016/6/8 0008.
 */
public class PowerOfFour_342 {
    public boolean isPowerOfFour(int num) {
        if(((num & (num-1)) == 0) && ((num & 0x55555555) != 0))
            return true;
        return false;
    }
}
