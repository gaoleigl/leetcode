package algorithm;

/**
 * Created by Administrator on 2016/6/12 0012.
 */
public class MajrorityElement_169 {
    public int majorityElement(int[] nums) {
        int element = 0;
        int cnt = 0;
        for(int i = 0; i < nums.length; ++i) {
            if(cnt == 0) {
                element = nums[i];
                cnt++;
            }
            else {
                if(nums[i] != element)
                    cnt --;
                else
                    cnt ++;
            }
        }
        return element;
    }
}
