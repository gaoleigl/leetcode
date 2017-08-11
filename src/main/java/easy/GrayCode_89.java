package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/19 0019.
 */
public class GrayCode_89 {
    public static List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
    if(n == 0)
            return list;
    list.add(1);
    for(int i = 2;i <= n; i++) {
        int plus = 1<<(i-1);
        for(int j = list.size()-1; j >= 0; j--) {
            list.add(list.get(j)+plus);
        }
    }
    return list;
}

    public static void main(String[] args) {
        System.out.println(grayCode(3));
    }
}
