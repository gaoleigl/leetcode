package search;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/19 0019.
 */
public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        dfs(result, new StringBuilder(), n, 0, 0);
        return result;
    }

    public static void dfs(List<String> result, StringBuilder curSb, int tot, int left, int right) {
        // 如果当前已经填写的右括号等于tot了，说明全填写完成了，加到result中，再return
        if(right == tot) {
            result.add(curSb.toString());
            return;
        }

        // 如果当前还有左括号，那左括号加进去
        if(left < tot) {
            curSb.append("(");
            dfs(result, curSb, tot, left + 1, right);
            curSb.deleteCharAt(curSb.length() - 1);
        }
        //当前还有没匹配的左括号，那放一个右括号
        if(left - right > 0) {
            curSb.append(")");
            dfs(result, curSb, tot, left, right + 1);
            curSb.deleteCharAt(curSb.length() - 1);
        }
    }

    public static void main(String[] args) {


        System.out.println(generateParenthesis(3));
    }
}
