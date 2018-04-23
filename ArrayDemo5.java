/**
 * Created by Jinlong Xu on 2018/4/23.
 */

/**
	数组操作常见的两个小问题:
		A:数组索引越界
			ArrayIndexOutOfBoundsException
			因为我们访问了不存在的索引。
		B:空指针异常
			NullPointerException
			因为数组已经不再指向堆内存，所以就不能再去访问堆内存的元素了。
*/
public class ArrayDemo5 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        arr = null; // 空指针异常，因为数组不再指向堆内存，就不能去访问堆内存的元素了
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
