package ExceptionDemo;

public class ExceptionDemo03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("看看我执行了吗");
    }
}
