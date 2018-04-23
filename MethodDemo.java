/**
 * Created by Jinlong Xu on 2018/4/23.
 */

/**
 * 如果一个类中有多个具有相同名称但参数不同，与返回值无关的方法，则成为方法重载。
 * 方法重载提高了程序的可读性
 *
 * 在java中重载方法有两种方式，分别是：
 * 1、通过改变参数的数量
 * 2、通过改变数据类型
 *
 * 方法重载：
 *      在同一个类中，允许存在一个以上的同名方法，
 *      只要它们的参数个数或者参数类型不同即可。和返回值类型无关。
 *
 * */
public class MethodDemo {

    public static void main(String[] args) {
        // 写出一个功能，实现两个数据的求和
        System.out.println(sum(10, 20));

        // 写出一个功能，实现三个数据的求和
        System.out.println(sum(10, 20, 30));

        System.out.println(sum(1.5, 2.5));
    }

    public static int sum(int a, int b) {
        return (a + b);
    }

    // 改变参数
    public static int sum(int a, int b, int c) {
        return (a + b + c);
    }

    // 改变数据类型
    public static double sum(double a, double b) {
        return (a + b);
    }
}
