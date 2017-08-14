package easy;

/**
 * Created by GL on 2017/8/14.
 * mysql problem，没什么意义，or一下就行了
 */
public class BigCountries_595 {
    String res = "select name, population, area\n" +
            "from World\n" +
            "where (area > 3000000 or population > 25000000 )";

}
