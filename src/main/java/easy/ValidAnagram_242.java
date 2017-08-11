package easy;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        int[] cnt = new int[26];
        for(int i = 0; i < s.length(); ++i)
            cnt[s.charAt(i)-'a'] ++;
        for(int i = 0; i < t.length(); ++i)
            cnt[t.charAt(i)-'a'] --;
        for(int i = 0; i < 26; ++i) {
            if(cnt[i] != 0)
                return false;
        }
        return true;
    }
}
