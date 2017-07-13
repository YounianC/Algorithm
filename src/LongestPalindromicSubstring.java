/**
 * Created by Administrator on 2017/7/13.
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "abcdasdfghjkldcba";
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        System.out.println("" + longestPalindromicSubstring.longestPalindrome(str));
    }

    /*public String longestPalindrome(String s) {
        String revert = new StringBuilder(s).reverse().toString();
        for (int i = s.length(); i >= 0; i--) {
            for (int j = 0; j <= s.length() - i; j++) {
                String sub = s.substring(j, j + i);
                if (revert.contains(sub))
                    return sub;
            }
        }
        return "";
    }*/

    public String longestPalindrome(String s) {
        String revert = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    continue;
                }
                if(flag){

                }
            }
        }
        return "";
    }
}
