/**
 * Created by Jinlong Xu on 2018/4/23.
 */
public class ArrayDemo6 {

    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55, 66};

        // 方式一：一句一句打印每一个值
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("-----------");
        // 方式二：用循环的方式打印出每一个值
        for ( int x = 0; x < 6; x++) {
            System.out.println("arr[" + x + "] = " + arr[x]);
        }
        System.out.println("------------");
        // 方式三：用数组名.length来表示数组的长度
        // 格式是：数组名.length
        for ( int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i  + "] = "+ arr[i]);
        }

        // 通过循环赋值数组中的元素
        int[] arr2 = new int[6];
        for(int j = 0; j < arr2.length; j++) {
            arr2[j] = j;
            System.out.println(arr2[j]);
        }

    }
}
