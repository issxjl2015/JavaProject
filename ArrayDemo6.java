/**
 * Created by Jinlong Xu on 2018/4/23.
 */
public class ArrayDemo6 {

    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55, 66};

        // ��ʽһ��һ��һ���ӡÿһ��ֵ
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("-----------");
        // ��ʽ������ѭ���ķ�ʽ��ӡ��ÿһ��ֵ
        for ( int x = 0; x < 6; x++) {
            System.out.println("arr[" + x + "] = " + arr[x]);
        }
        System.out.println("------------");
        // ��ʽ������������.length����ʾ����ĳ���
        // ��ʽ�ǣ�������.length
        for ( int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i  + "] = "+ arr[i]);
        }

        // ͨ��ѭ����ֵ�����е�Ԫ��
        int[] arr2 = new int[6];
        for(int j = 0; j < arr2.length; j++) {
            arr2[j] = j;
            System.out.println(arr2[j]);
        }

    }
}
