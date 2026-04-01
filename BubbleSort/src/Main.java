//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
        int[] array = {6, 5, 4 ,2, 3, 7, 8, 0, 10, 11, 1};

        bubbleSort(array);
        for (int i:array){
            System.out.print(i + " ");
        }
	}

    public static void bubbleSort(int[] array){
        for(int i = 0; i < array.length-1; i++ ){
            for(int j = 0; j < array.length - i -1; j++){
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
