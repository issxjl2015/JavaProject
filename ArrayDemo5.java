/**
 * Created by Jinlong Xu on 2018/4/23.
 */

/**
	�����������������С����:
		A:��������Խ��
			ArrayIndexOutOfBoundsException
			��Ϊ���Ƿ����˲����ڵ�������
		B:��ָ���쳣
			NullPointerException
			��Ϊ�����Ѿ�����ָ����ڴ棬���ԾͲ�����ȥ���ʶ��ڴ��Ԫ���ˡ�
*/
public class ArrayDemo5 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        arr = null; // ��ָ���쳣����Ϊ���鲻��ָ����ڴ棬�Ͳ���ȥ���ʶ��ڴ��Ԫ����
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
