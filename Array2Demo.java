/**
 * Created by Jinlong Xu on 2018/4/23.
 */

/**
class Array2Demo {

    public static void main(String[] args) {

        int[][] arr = new int[3][2];

        // 输出每一个一维数组的地址
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 输出元素
        System.out.println(arr[0][1]);
        System.out.println(arr[1][2]);
    }
}
*/

class Array2Demo {
    public static void main(String[] args) {
        //定义一个二维数组
        int[][] arr = new int[3][2];
        //表示arr这个二维数组有三个元素
        //每个元素是一个一维数组
        //每一个一维数组有2个元素

        System.out.println(arr); //[[I@778b3fee
        System.out.println(arr[0]); //[I@57125f92
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //如何输出元素呢?
        System.out.println(arr[0][1]);
        System.out.println(arr[2][2]);
    }
}