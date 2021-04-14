
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        int size = array.length;
        int min = -1;

        if (size > 0) {
            min = array[0];

            for (int i = 1; i < size; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {
        int size = array.length;
        int min;
        int mindex = -1;

        if (size > 0) {
            min = array[0];
            mindex = 0;

            for (int i = 1; i < size; i++) {
                if (array[i] < min) {
                    min = array[i];
                    mindex = i;
                }
            }
        }
        return mindex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int size = table.length;
        int min;
        int mindex = -1;

        if (startIndex < size) {
            min = table[startIndex];
            mindex = startIndex;

            for (int i = startIndex; i < size; i++) {
                if (table[i] < min) {
                    min = table[i];
                    mindex = i;
                }
            }
        }
        return mindex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int size = array.length;

        if (index1 >= 0 && index1 < size && index2 >= 0 && index2 < size) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
        System.out.println(array);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}
