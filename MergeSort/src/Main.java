public class Main {
    
    public static void main(String[] args) {
        int [] array = {2, 4, 6, 7, 3, 1, 8, 5, 9, 10};

        System.out.println("Unsorted Array: ");

        for (int i : array){
            System.out.print(i + " ");
        } 
        
        mergeSort(array);
        System.out.println("\n");
        System.out.println("The array has been sorted.");
        System.out.println("Sorted Array: ");

        for (int i : array){
            System.out.print(i + " ");
        }

    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return; // basecase

        int middle = length/2;
        int [] leftArray = new int[middle];
        int [] rightArray = new int [length - middle];

        int i = 0;  // left Array
        int j = 0;  // right Array

        for (; i < length; i++){
            if (i < middle){
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int [] leftArray, int [] rightArray, int[] array){
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
