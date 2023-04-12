import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author shaox
 * @date 2023/4/7
 * @apiNote
 */
public class test {
    public static void main(String[] args) {
        int[] arr = {100, 9, 22, 2, 19, 24, 321, 35, 214, 45, 418, 1, 50};

        MaoPaoshaox(arr);
    }


    public static int shaox(int i, int[] arr) {
        int l = 0, r = arr.length - 1, m;
        while (l <= r) {
            m = (l + r) / 2;
            if (arr[m] == i) {
                return m;
            } else if (arr[m] > i) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    } //二分查找

    public static void MaoPaoshaoxPlus(int[] arr) {
        int l = arr.length - 1;
        //一直循环
        while (true) {
            int index = 0;
            for (int i = 0; i < l; i++) {

                if (arr[i] > arr[i + 1]) {
                    swap(arr, i);
                    index = i;
                }
                l = index;
            }
            Arrays.toString(arr);
            if (l == 0) {
                break;
            }
        }
        /*生成一个长度时String数组 */


    }//冒泡排序

    public static void MaoPaoshaox(int[] arr) {
        int i = arr.length - 1;

        while (true) {
            int last = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                    last = j;
                }
            }
            i = last;
            System.out.println(Arrays.toString(arr));
            if (i == 0) {
                break;
            }
        }


    }//冒泡排序

    private static void swap(int[] arr, int j) {
        int a = arr[j + 1];
        arr[j + 1] = arr[j];
        arr[j] = a;
    }   //二分查找数据交换

    public static void xuanze(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int s = i;

            for (int j = s+1; j < arr.length ; j++) {
                if (arr[s] > arr[j]) {
                    s = j;
                }
            }
            if (s!= i) {
               int num= arr[i];
                arr[i]=arr[s];
                arr[s] = num;
            }
            System.out.println(Arrays.toString(arr));
        }


    }//选择排序
/*
    public static void shuangpai(int[] arr) {
        ArrayList objects = new ArrayList<>();
        objects.addAll(arr);

    }//选择排序


*/

}
