public class UncommonErrorSolution {

    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            int index = 10; // The potentially problematic index

            // Add bounds checking
            if (index >= 0 && index < array.length) {
                int value = array[index];
                System.out.println(value);
            } else {
                System.err.println("Index out of bounds: " + index);
            }
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}