/**
 * Created by Jinlong Xu on 2018/4/23.
 */

/**
class Array2Demo {

    public static void main(String[] args) {

        int[][] arr = new int[3][2];

        // ���ÿһ��һά����ĵ�ַ
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // ���Ԫ��
        System.out.println(arr[0][1]);
        System.out.println(arr[1][2]);
    }
}
*/

class Array2Demo {
    public static void main(String[] args) {
        //����һ����ά����
        int[][] arr = new int[3][2];
        //��ʾarr�����ά����������Ԫ��
        //ÿ��Ԫ����һ��һά����
        //ÿһ��һά������2��Ԫ��

        System.out.println(arr); //[[I@778b3fee
        System.out.println(arr[0]); //[I@57125f92
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //������Ԫ����?
        System.out.println(arr[0][1]);
        System.out.println(arr[2][2]);
    }
}