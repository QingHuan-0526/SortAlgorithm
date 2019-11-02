package cn.lzx.other;

/**
 * @ClassNameDemo
 * @Description 递归
 * @Author lzx
 * @Date2019/10/25 17:32
 * @Version V1.0
 **/
public class Recursion {

    //非递归
    private static int getMax(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
        }
        return max;
    }

    //递归
    //将数组划分为左右两部分分别计算 则数组最大值即左边最大值和右边最大值中的比较大的值
    private static int getMax2(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int maxLeft = getMax2(arr, left, mid);
        int maxRight = getMax2(arr, mid + 1, right);
        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 11, -9, 0, 16, 94, 21};
        System.out.println(getMax(arr));
        System.out.println(getMax2(arr, 0, arr.length - 1));
    }

}
