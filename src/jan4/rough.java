package jan4;
public class rough {
    public static void moveNegativesToLeft(int[] arr) {
        int pos = 0; // Pointer for the position to place the next negative number

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                // Shift elements to maintain order
                for (int j = i; j > pos; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[pos] = temp;
                pos++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, -2, 4, -1, 0, -5, 8};
        moveNegativesToLeft(arr);

        // Print rearranged array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
