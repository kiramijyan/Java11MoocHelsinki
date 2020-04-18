import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
       
        int[] numbers = {8, 63, 7, 0, -50, 2, 85};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
        
        int small = array[0];
        
        for(int i = 0; i < array.length; i++ ){
            if(array[i] < small){
                small = array[i];
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array){
        
        int small = array[0];
        int smallestIndex = 0;
        
        for(int i = 0; i < array.length; i++ ){
            if(array[i] < small){
                small = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    
        int smallestIndexFrom = startIndex;
     
        for(int i = startIndex; i < table.length; i++){

            if(table[i] <= table[smallestIndexFrom]){
                smallestIndexFrom = i; 
            }
        }
        return smallestIndexFrom;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        
        int helper = 0;
        
        helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper; 
    }
    
    public static void sort(int[] array) {
 
        int itemToSwap = 0;
        int secondItemToSwat = 0;

        for (int i = 0; i < array.length; i++){

            System.out.println(Arrays.toString(array));
            secondItemToSwat = indexOfSmallestFrom(array, i);
            swap(array, itemToSwap, secondItemToSwat );
            
            itemToSwap++;
        }
        
    }
}
