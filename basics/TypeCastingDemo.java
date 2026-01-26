class TypeCastingDemo {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // Implicit casting

        double x = 9.8;
        int y = (int) x; // Explicit casting

        System.out.println("Implicit casting (int to double): " + b);
        System.out.println("Explicit casting (double to int): " + y);
    }
}
