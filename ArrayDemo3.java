/**
 * Created by Jinlong Xu on 2018/4/23.
 */

/**
	�����������飬�ȶ���һ�����飬��ֵ�������
	Ȼ����ڶ��������ʱ��ѵ�һ������ĵ�ַ��ֵ���ڶ������顣
	Ȼ����ڶ������鸳ֵ���ٴ�����������������Ԫ�ء�
*/
public class ArrayDemo3 {

    public static void main(String[] args) {
        // ����һ������
        int[] arr = new int[3];

        // ��������Ԫ�ظ�ֵ
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // ����ڶ�������
        int[] arr2 = arr;
        arr2[0] = 100;

        // ��arr�ĵ�ַ��ֵ��arr2�󣬶�arr2�����е�Ԫ�ظ�ֵ��ı�arr�����е�Ԫ��
        // ��Ϊarr2��arr�ĵ�ַ��һ���ģ�������������Ϊ��ͬһ�����飬ֻ�ǲ�ͬ������������
        System.out.println("arr[0] = " + arr[0]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
