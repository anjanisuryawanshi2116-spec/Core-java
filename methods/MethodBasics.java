public class MethodBasics {

    static void printMessage() {
        System.out.println("Learning Java Methods");
    }

    static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        printMessage();
        addNumbers(10, 20);
    }
}
