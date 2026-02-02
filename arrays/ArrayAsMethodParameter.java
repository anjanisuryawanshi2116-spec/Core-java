public class ArrayAsMethodParameter {

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        System.out.println("Array elements:");
        printArray(numbers);
    }
}
