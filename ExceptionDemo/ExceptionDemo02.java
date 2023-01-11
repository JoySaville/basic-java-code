package ExceptionDemo;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        try {
            System.out.println(arr[5]);//如果出现异常，则会创建Exception的类，与下面catch里的异常类做对比

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组索引越界异常");
        }
        System.out.println("你看看我执行了吗");
    }
}
