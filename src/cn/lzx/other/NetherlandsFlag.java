package cn.lzx.other;

/**
 *@ClassNameNetherlandsFlag
 *@Description  荷兰国旗问题
 *@Author lzx
 *@Date2019/10/28 12:51
 *@Version V1.0
 **/
public class NetherlandsFlag {


    /**
     * 将数组的某一区域划分为小于num和大于num的两部分区域 返回等于区域的左右下标
     * @param arr  数组
     * @param left  数组左边界
     * @param right  数组右边界
     * @param num  比较数值
     * @return  等于区域的左右下标
     */
    private static int[] partition(int[] arr,int left,int right,int num){

        //小于区域
        int less = left - 1;
        //大于区域
        int more = right + 1;
        //当前下标
        int cur = left;
        while(cur < more){
            if (arr[cur] < num){
                swap(arr,++less,cur++);
            }else if (arr[cur] > num){
                swap(arr,--more,cur);
            }else {
                cur++;
            }
        }
        return new int[]{less + 1,more - 1};
    }


    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void print(int[] arr) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            res.append(arr[i]).append(" ");
        }
        System.out.println(res.toString());
    }

    public static void main(String[] args) {
        int[] arr = new int[]{15,9,42,10,16,2,7,-8,10};
        int[] res = partition(arr, 0, arr.length - 1, 10);
        print(arr);
        print(res);
    }


}
