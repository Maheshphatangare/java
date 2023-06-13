public class MinMaxElement {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 16, 1, 10};
        findMinMax(array);
    }

    public static void findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
