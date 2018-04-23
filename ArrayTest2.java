/**
 * Created by Jinlong Xu on 2018/4/23.
 */

/**
	数组元素反转 (就是把元素对调)

	分析：
		如何做反转呢?
			把第一个和最后一个交换
			把第二个和倒数第二个交换
			...
*/
public class ArrayTest2 {

    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55, 66};
        // 遍历数组
        printArray(arr);

        System.out.println("------------------");

        reverse(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "} = " + arr[i]);
        }
    }

    public static void reverse(int[] arr) {

        // 这种写法要记住
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
