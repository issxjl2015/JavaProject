/**
 * Created by Jinlong Xu on 2018/4/23.
 */

/**
	����Ԫ�ط�ת (���ǰ�Ԫ�ضԵ�)

	������
		�������ת��?
			�ѵ�һ�������һ������
			�ѵڶ����͵����ڶ�������
			...
*/
public class ArrayTest2 {

    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55, 66};
        // ��������
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

        // ����д��Ҫ��ס
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
