/**
 * Created by Jinlong Xu on 2018/4/23.
 */

/**
 * ���һ�������ж��������ͬ���Ƶ�������ͬ���뷵��ֵ�޹صķ��������Ϊ�������ء�
 * ������������˳���Ŀɶ���
 *
 * ��java�����ط��������ַ�ʽ���ֱ��ǣ�
 * 1��ͨ���ı����������
 * 2��ͨ���ı���������
 *
 * �������أ�
 *      ��ͬһ�����У��������һ�����ϵ�ͬ��������
 *      ֻҪ���ǵĲ����������߲������Ͳ�ͬ���ɡ��ͷ���ֵ�����޹ء�
 *
 * */
public class MethodDemo {

    public static void main(String[] args) {
        // д��һ�����ܣ�ʵ���������ݵ����
        System.out.println(sum(10, 20));

        // д��һ�����ܣ�ʵ���������ݵ����
        System.out.println(sum(10, 20, 30));

        System.out.println(sum(1.5, 2.5));
    }

    public static int sum(int a, int b) {
        return (a + b);
    }

    // �ı����
    public static int sum(int a, int b, int c) {
        return (a + b + c);
    }

    // �ı���������
    public static double sum(double a, double b) {
        return (a + b);
    }
}
