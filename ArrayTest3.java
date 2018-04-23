/**
 * Created by Jinlong Xu on 2018/4/23.
 */

/**
	数组元素查找(查找指定元素第一次在数组中出现的索引)

	思路：
		从头开始遍历，依次比较元素，只要找到了，就返回该处的索引。
*/
public class ArrayTest3 {

    public static void main(String[] args) {

        int[] arr = {23, 35, 56, 78, 26};

        int index = getIndex(arr, 56);
        System.out.println("56在数组中的索引是：" + index);

        int index2 = getIndex(arr, 78);
        System.out.println("78在数组中的索引是：" + index2);
    }

    public static int getIndex(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++ ) {
            // 一旦匹配成功就直接赋值index，且 break，跳出整个循环
            if ( arr[i] == key ) {
                index = i;
                break;
            }
        }

        return index;
    }
}
