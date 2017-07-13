/**
 * Created by Administrator on 2017/7/13.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
       /* System.out.println("" + reverseInteger.reverse(10));
        System.out.println("" + reverseInteger.reverse(123));
        System.out.println("" + reverseInteger.reverse(-123));
        System.out.println("" + reverseInteger.reverse(1534236469));*/
        System.out.println("" + Integer.MAX_VALUE);
        System.out.println("" + Integer.MIN_VALUE);
        System.out.println("" + reverseInteger.reverse(-2147483648));
        System.out.println("" + reverseInteger.reverse(2147483647));
    }

    /*public int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder(x > 0 ? "" + x : "" + (-x)).reverse();
        try {
            int res = x > 0 ? Integer.parseInt(stringBuilder.toString()) : -Integer.parseInt(stringBuilder.toString());
            return res;
        }catch (NumberFormatException e){
            return 0;
        }
    }*/

    public int reverse(int x) {
        if (x < 10 && x > -10)
            return x;
        if (x == Integer.MIN_VALUE)
            return 0;
        int t = Math.abs(x);
        double sum = 0;
        while (t >= 10) {
            int c = t % 10;
            sum = sum * 10 + c;
            t /= 10;
        }
        sum = sum * 10 + t;
        if (sum > 2147483647) {
            return 0;
        }
        return (int) (x > 0 ? sum : -sum);
    }
}
