/**
 * Created by Administrator on 2017/7/13.
 */
public class StringtoInteger {
    public static void main(String[] args) {
        StringtoInteger stringtoInteger = new StringtoInteger();
        System.out.println("" + stringtoInteger.myAtoi("1231231"));
        System.out.println("" + stringtoInteger.myAtoi("-1231231"));
        System.out.println("" + stringtoInteger.myAtoi("2147483647"));
        System.out.println("" + stringtoInteger.myAtoi("-2147483648"));
        System.out.println("" + stringtoInteger.myAtoi("2147483648"));
        System.out.println("" + stringtoInteger.myAtoi("+"));
        System.out.println("" + stringtoInteger.myAtoi("   +10"));
        System.out.println("" + stringtoInteger.myAtoi("-   10"));
        System.out.println("" + stringtoInteger.myAtoi("     +004500"));
        System.out.println("" + stringtoInteger.myAtoi("  -0012a42"));
        System.out.println("" + stringtoInteger.myAtoi("   +0 123"));
        System.out.println("" + stringtoInteger.myAtoi("   a 123"));
    }

    public int myAtoi(String str) {
        str = str.trim();
        int sum = 0;
        int i = 0;
        boolean flag = false;
        boolean flag2 = false;
        if (str.startsWith("-")) {
            i++;
            flag = true;
        } else if (str.startsWith("+")) {
            i++;
        }
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                if (flag2)
                    break;
                else
                    continue;
            }
            if (str.charAt(i) < '0' || str.charAt(i) > '9')
                break;
            int c = str.charAt(i) - '0';
            sum = sum * 10 + c;
            flag2 = true;
        }
        return flag ? -sum : sum;
    }
}
