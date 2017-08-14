package easy;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by GL on 2017/8/14.
 * 给出两个String代表复数，返回乘积，比较简单，注意用split拿到a+bi中的a,b，另外 i^2 = -1  高中复数知识
 * string.split方法，可以用[+i]这种形式代表用加号和i 分割，这样+就不用 \\+了
 */
public class ComplexNumberMultiplication_537 {
    public String complexNumberMultiply(String a, String b) {

        String[] aArr = a.split("[+i]");
        String[] bArr = b.split("[+i]");
        int a1 = Integer.valueOf(aArr[0]);
        int b1 = Integer.valueOf(aArr[1]);

        int a2 = Integer.valueOf(bArr[0]);
        int b2 = Integer.valueOf(bArr[1]);


        StringBuilder sb = new StringBuilder();
        sb.append(a1 * a2 - b1 * b2).append("+").append(a1 * b2 + b1 * a2).append("i");
        return sb.toString();
    }

    public static void main(String[] args) {
        String tmp = "1+-2i";
        String[] num = tmp.split("\\+|i");
        System.out.println(Arrays.toString(num));
    }
}
