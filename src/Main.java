public class Main {
    public static void main(String[] args) {

        int[] array = {22, 100, 55, 33, 88, 7};
        printArray(array);
        insertionSort(array);
        printArray(array);

    }

    public static void insertionSort(int[] array) {

        for (int j = 1; j < array.length; j++) {
            int num = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > num)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = num;
        }

    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

    }
}