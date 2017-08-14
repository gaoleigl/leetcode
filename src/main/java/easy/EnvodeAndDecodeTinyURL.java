package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GL on 2017/8/14.
 * 把长的URl转为短的，实际上生产上都是用db的自增主键做的。。相当于映射到表的id，没实际意义
 */
public class EnvodeAndDecodeTinyURL {

    List<String> urlList = new ArrayList<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        urlList.add(longUrl);
        return String.valueOf(urlList.size() - 1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int index = Integer.parseInt(shortUrl);
        return index < urlList.size() ? urlList.get(index) :"";
    }
}
