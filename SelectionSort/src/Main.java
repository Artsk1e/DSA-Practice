//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
        int [] array = {9, 2, 4, 5 ,3, 1, 6, 8 ,7, 10};
        printArray(array);
        selectionSort(array);
        printArray(array);
	}

    public static void selectionSort(int[] array){
        int n = array.length;

        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(array[j] < array[min]){
                min = j;
            }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void printArray(int[] array){
        for (int value: array){
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
