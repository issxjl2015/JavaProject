import java.awt.*;

/**
 * Created by Jinlong Xu on 2018/4/23.
 */
public class ArrayTest {

    public static void main(String[] args) {

        // ��������
        int[] arr = {11, 22, 33, 44, 55, 66};

        // ���÷���
        int max = getMax(arr);
        int min = getMin(arr);

        // ������ֵ����Сֵ
        System.out.println("This max value is " + max);
        System.out.println("This min value is " + min);
    }

    public static int getMax(int[] arr) {
        // �����������ֵΪ����ĵ�һ��Ԫ����Ϊ�˱�����������õ�����������������Ԫ�أ����ִ���
        int max = arr[0];

        // �� 1 ��ʼ��������Ϊ��ʼ���ֵ����Ϊ�˵�һ��Ԫ��
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
