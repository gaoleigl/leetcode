package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GL on 2017/8/14.
 */
public class FizzBuzz_412 {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i = 1; i <= n; ++i) {
            String str = "";
            if(i % 3 == 0)
                str = "Fizz";
            if(i % 5 == 0)
                str += "Buzz";
            if(str == "")
                str += i;

            res.add(str);
        }
        return res;
    }
}
