/**
 * Created by Jinlong Xu on 2018/4/23.
 */

/**
	数组：存储同一种数据类型的多个元素的集合。(也可以称为容器)

	数组的定义格式：
		格式1：数据类型[] 数组名;
			int[] arr;
		格式2：数据类型 数组名[];
			int arr[];

		推荐方式1。

	现在的数组没有元素，使用是没有意义的。
	接下来，我们要对数组进行初始化。
	那么，我们如何对数组进行初始化呢?
		动态初始化：初始化时只指定数组长度，由系统为数组分配初始值。
		静态初始化：初始化时指定每个数组元素的初始值，由系统决定数组长度。

	动态初始化：
		数据类型[] 数组名 = new 数据类型[数组长度];

*/

public class ArrayDemo {

    public static void main(String[] args) {

        // 按照动态初始化数组的方式，定义了一个存储3个int类型元素的数组
        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
