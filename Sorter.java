public class Sorter {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j; //search for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String[] args) {
        // Test the  method
        int[] testArray = {64, 34, 555, 12, 22, 444, 90};
        selectionSort(testArray);
        for (int i : testArray) {
            System.out.print(i + " ");
        }
    }
}
