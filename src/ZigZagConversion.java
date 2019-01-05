import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/7/13.
 */
public class ZigZagConversion {
    public static void main(String[] args) {
        new ZigZagConversion().convert("PAYPALISHIRING", 3);
    }

    public String convert(String s, int numRows) {
        if(s.length() <= numRows || numRows < 2)
            return s;
        int max = s.length() / (numRows + numRows - 2) + 1;

        List<StringBuilder> arr = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            arr.add(new StringBuilder(""));
        }

        for (int m = 0; m < max; m++) {
            int start = m * (numRows + numRows - 2);
            int nextStart = (m + 1) * (numRows + numRows - 2);

            if (start < s.length()) {
                arr.get(0).append(s.charAt(start));
            }

            for (int i = 1; i <= numRows - 2; i++) {
                if (start + i < s.length()) {
                    arr.get(i).append(s.charAt(start + i));
                }

                if (nextStart - i < s.length()) {
                    arr.get(i).append(s.charAt(nextStart - i));
                }
            }

            if (start + numRows - 1 < s.length()) {
                arr.get(numRows - 1).append(s.charAt(start + numRows - 1));
            }
        }
        return arr.stream().collect(Collectors.joining());
    }
}
