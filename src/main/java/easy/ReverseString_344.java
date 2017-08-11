package easy;

/**
 * Created by Administrator on 2016/6/7 0007.
 */
public class ReverseString_344 {
    public String reverseString(String s){
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = charArray.length - 1; i >=0; i--) {
            sb.append(charArray[i]);
        }
        return sb.toString();

        // better solution
        // return new StringBuilder(s).reverse().toString();
    }
}
