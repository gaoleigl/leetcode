package easy;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class IntegerToRoman_12 {
    public String intToRoman(int num) {
        int[] transfer = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < transfer.length; ++i) {
            while (num >= transfer[i]) {
                num -= transfer[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }
}
