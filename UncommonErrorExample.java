public class UncommonErrorExample {

    public static void main(String[] args) {
        try {
            // Simulate an uncommon error: accessing a non-existent array element
            int[] array = new int[5];
            int value = array[10]; // This will throw an ArrayIndexOutOfBoundsException
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // This is a common error, but the specific scenario might be uncommon
            System.err.println("Uncommon array access error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}