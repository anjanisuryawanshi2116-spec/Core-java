public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};

        System.out.println("Traversing array using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Traversing array using for-each loop:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
