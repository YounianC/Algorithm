/**
 * Created by Administrator on 2017/7/12.
 */
public class LongestSubStr {
    public static void main(String[] args) {
        String str = "abcabcbb";
        LongestSubStr longestSubStr = new LongestSubStr();
        float before = System.currentTimeMillis();
        System.out.println("" + longestSubStr.lengthOfLongestSubstring(str));
        float after = System.currentTimeMillis();

        System.out.println("" + (after - before));
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int cur = 0;
        for (start = 0; start < s.length(); start++) {
            int count = 1;
            for (cur = start + 1; cur < s.length(); cur++) {
                boolean flag = false;
                for (int i = start; i < cur; i++) {
                    if (s.charAt(i) == s.charAt(cur)) {
                        flag = true;
                    }
                }
                if (flag)
                    break;
                count++;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
