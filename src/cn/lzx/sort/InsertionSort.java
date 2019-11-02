package cn.lzx.sort;

/**
 * @ClassNameInsertionSort
 * @Description 插入排序
 * @Author lzx
 * @Date2019/10/25 15:05
 * @Version V1.0
 **/
public class InsertionSort {

    private static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //i是要插入的数的下标  i之前已经有序
        for (int i = 1; i < arr.length; i++)
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
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
        insertionSort(arr);
        print(arr);
    }


}
