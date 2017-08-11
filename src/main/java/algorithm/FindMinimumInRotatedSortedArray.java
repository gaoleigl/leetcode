package algorithm;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if(nums.length <= 1)
            return nums[0];
        int low = 0,high = nums.length -1,mid= 0;
        while (low < high) {
            mid = low + (high - low) /2;
            if(mid > 0 && nums[mid] < nums[mid-1])
                return nums[mid];
            if(nums[mid] >= nums[low] && nums[mid] > nums[high])
                low = mid + 1;
            else
                high = mid -1;
        }
        return nums[low];
    }

    public static void main(String[] args) {
        Integer a = 3;
        Integer b = 3;                  // 将3自动装箱成Integer类型
        int c = 3;
        System.out.println(a == b);     // false 两个引用没有引用同一对象
        System.out.println(a == c);     // true a自动拆箱成int类型再和c比较
    }
}