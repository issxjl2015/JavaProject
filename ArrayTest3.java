/**
 * Created by Jinlong Xu on 2018/4/23.
 */

/**
	����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)

	˼·��
		��ͷ��ʼ���������αȽ�Ԫ�أ�ֻҪ�ҵ��ˣ��ͷ��ظô���������
*/
public class ArrayTest3 {

    public static void main(String[] args) {

        int[] arr = {23, 35, 56, 78, 26};

        int index = getIndex(arr, 56);
        System.out.println("56�������е������ǣ�" + index);

        int index2 = getIndex(arr, 78);
        System.out.println("78�������е������ǣ�" + index2);
    }

    public static int getIndex(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++ ) {
            // һ��ƥ��ɹ���ֱ�Ӹ�ֵindex���� break����������ѭ��
            if ( arr[i] == key ) {
                index = i;
                break;
            }
        }

        return index;
    }
}
