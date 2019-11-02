package cn.lzx.sort;

/**
 * @ClassNameSelectionSort
 * @Description 选择排序
 * @Author lzx
 * @Date2019/10/25 14:50
 * @Version V1.0
 **/
public class SelectionSort {


    private static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //i是每次开始的数的下标
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[minIndex] > arr[j] ? j : minIndex;
            }
            //每次将最小的数放到i位置
            swap(arr, minIndex, i);
        }
    }

    //交换
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void swap2(int[] arr,int i,int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
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
        selectionSort(arr);
        print(arr);
    }


}
