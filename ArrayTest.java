import java.awt.*;

/**
 * Created by Jinlong Xu on 2018/4/23.
 */
public class ArrayTest {

    public static void main(String[] args) {

        // 定义数组
        int[] arr = {11, 22, 33, 44, 55, 66};

        // 调用方法
        int max = getMax(arr);
        int min = getMin(arr);

        // 输出最大值和最小值
        System.out.println("This max value is " + max);
        System.out.println("This min value is " + min);
    }

    public static int getMax(int[] arr) {
        // 这里设置最大值为数组的第一个元素是为了避免出现你设置的数大于数组中任意元素，出现错误
        int max = arr[0];

        // 从 1 开始遍历是因为初始最大值设置为了第一个元素
        for (int i = 1; i < arr.length; i++) {
            if (max > arr[i]) {
                continue;
            } else {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++ ) {
            if ( min < arr[i] ) {
                continue;
            } else {
                min = arr[i];
            }
        }
        return min;
    }
}
