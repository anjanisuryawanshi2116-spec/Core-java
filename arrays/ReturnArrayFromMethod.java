public class ReturnArrayFromMethod {

    static int[] createArray() {
        int[] arr = {1, 2, 3, 4, 5};
        return arr;
    }

    public static void main(String[] args) {
        int[] result = createArray();

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


