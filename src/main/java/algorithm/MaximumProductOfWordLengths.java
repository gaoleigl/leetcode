package algorithm;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
public class MaximumProductOfWordLengths {
    public int maxProduct(String[] words) {
        //第一遍，words转int
        int length = words.length;
        int[] wordsToInt = new int[length];
        for(int i = 0; i < length; ++i) {
            for(int j = 0; j < words[i].length(); ++j) {
                wordsToInt[i] = wordsToInt[i] | (1<<(words[i].charAt(j) - 'a'));
            }
        }

        int max = 0;
        for(int i = 0; i < length -1; ++i) {
            for(int j = 1; j < length; ++j) {
                if((wordsToInt[i] & wordsToInt[j]) == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
}
