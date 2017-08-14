package easy;

/**
 * Created by GL on 2017/8/14.
 * 简单水题，机器人回到远点，也就是说在横纵两个方向的相对位移都是0
 */
public class JudgeRouteCircle_657 {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) {
            if(ch == 'L')
                x --;
            else if (ch == 'R')
                x ++;
            else if (ch == 'U')
                y ++;
            else if (ch == 'D')
                y --;
        }
        return x == 0 && y == 0;
    }
}
