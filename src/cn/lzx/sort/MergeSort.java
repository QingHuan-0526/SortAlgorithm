package cn.lzx.sort;

/**
 * @ClassNameMergeSort
 * @Description 归并排序
 * @Author lzx
 * @Date2019/10/25 17:58
 * @Version V1.0
 **/
public class MergeSort {


    private static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        sortProcess(arr, 0, arr.length - 1);
    }


    private static void sortProcess(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }
//        int mid = (left + right)/2;   移位替代取余
        int mid = left + ((right - left) >> 1);
        sortProcess(arr, left, mid);
        sortProcess(arr, mid + 1, right);
        //合并
        merge(arr, left, mid, right);
    }


    private static void merge(int[] arr, int left, int mid, int right) {
        //辅助数组
        int[] help = new int[right - left + 1];
        int index = 0;
        int p1 = left;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= right) {
            help[index++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        //至少一个数组已经合并完了
        while (p1 <= mid) {
            help[index++] = arr[p1++];
        }
        while (p2 <= right) {
            help[index++] = arr[p2++];
        }
        //将辅助数组拷贝回原数组
        for (int i = 0; i < help.length; i++) {
            arr[left + i] = help[i];
        }
    }


    //输出
    private static void print(int[] arr) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arr.length - 1; i++) {
            res.append(arr[i]).append(" ");
        }
        System.out.println(res.toString());
    }


    public static void main(String[] args) {
        int[] arr = {4, 9, 0, 8, 3, 18, 1, 19, -8};
        mergeSort(arr);
        print(arr);
    }


}
