/**
 * Created by Jinlong Xu on 2018/4/23.
 */

/**
	定义两个数组，先定义一个数组，赋值，输出。
	然后定义第二个数组的时候把第一个数组的地址赋值给第二个数组。
	然后给第二个数组赋值，再次输出两个数组的名及元素。
*/
public class ArrayDemo3 {

    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = new int[3];

        // 给数组中元素赋值
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 定义第二个数组
        int[] arr2 = arr;
        arr2[0] = 100;

        // 将arr的地址赋值给arr2后，对arr2数组中的元素赋值会改变arr数组中的元素
        // 因为arr2和arr的地址是一样的，你甚至可以认为是同一个数组，只是不同的数组名而已
        System.out.println("arr[0] = " + arr[0]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
