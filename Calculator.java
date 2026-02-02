public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator Running...");
        
        // Test the operations
        System.out.println("5 + 3 = " + Addition.add(5, 3));
        System.out.println("5 - 3 = " + Subtraction.subtract(5, 3));
        System.out.println("5 * 3 = " + Multiplication.multiply(5, 3));
        System.out.println("6 / 3 = " + Division.divide(6, 3));
    }
}
