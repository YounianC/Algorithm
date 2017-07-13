import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 2017/7/12.
 */
public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        MedianofTwoSortedArrays medianofTwoSortedArrays = new MedianofTwoSortedArrays();
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double res = medianofTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        System.out.print("" + res);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (i < nums1.length || j < nums2.length) {
            if (i >= nums1.length) {
                list.add(nums2[j]);
                j++;
            } else if (j >= nums2.length) {
                list.add(nums1[i]);
                i++;
            } else if (nums1[i] < nums2[j] || j >= nums2.length) {
                list.add(nums1[i]);
                i++;
            } else {
                list.add(nums2[j]);
                j++;
            }
        }
        if (list.size() % 2 == 1) {
            return list.get(list.size() / 2);
        } else {
            int mid = list.size() / 2;
            return (list.get(mid - 1) + list.get(mid)) / 2.0;
        }
    }
}
