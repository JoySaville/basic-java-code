package Util01;

import java.util.ArrayList;

public class TestDome {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("段文豪","女",21);
        Student s2 = new Student("邓才慧","女",20);
        Student s3 = new Student("方世颖","女",19);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int maxAge = ArrayUtil.getMaxAge(list);
        System.out.println("年龄最大的是" + maxAge);
//        int[] arr = {1,2,3,4,5};
//        ArrayUtil.printArr(arr);
//        int avg = ArrayUtil.getAvg(arr);
//        System.out.println("这组数据的平均数是" + avg);
    }

}
