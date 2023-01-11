package ExceptionDemo;

public class ExceptionDemo04 {
    public static void main(String[] args) {
        int[] arr = {};
        int max = 0;
        try {
            max = getMax(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }
        System.out.println(max);
    }
    public static int getMax(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return arr[max];
    }
}
