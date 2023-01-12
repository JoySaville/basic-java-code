package Util01;

import java.util.ArrayList;

//工具类就是存放方法的类
public class ArrayUtil {
    private ArrayUtil() {

    }
    public static int getMaxAge(ArrayList<Student> list) {
        int maxAge = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            Student student = list.get(i);
            int age = student.getAge();
            if (maxAge < age) {
                maxAge = age;
            }
        }
        return maxAge;
    }
//    public static void printArr(int[] arr) {
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length-1) {
//                System.out.println(arr[i]+"]\n");
//            }else {
//                System.out.print(arr[i]+", ");
//            }
//        }
//    }
//    public static int getAvg(int[] arr) {
//        int avg = 0,sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        avg = sum / arr.length;
//        return avg;
//    }

}
