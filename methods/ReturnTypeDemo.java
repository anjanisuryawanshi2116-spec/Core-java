public class ReturnTypeDemo {

    static int add(int a, int b) {
        return a + b;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int result = add(5, 7);
        System.out.println("Addition: " + result);

        System.out.println("Is 10 even? " + isEven(10));
    }
}
