package cn.lzx.sort;

/**
 * @ClassNameBubbleSort
 * @Description 冒泡排序
 * @Author lzx
 * @Date2019/10/23 20:38
 * @Version V1.0
 **/
public class BubbleSort {


    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //end是每次比较的结束位置
        for (int end = arr.length - 1; end > 0; end--)
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    //逆序则交换
                    swap(arr, i, i + 1);
                }
            }
    }


    private static void bubbleSort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //i是循环次数
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //逆序则交换
                    swap(arr, j, j + 1);
                }
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
        bubbleSort(arr);
        print(arr);
    }


}
