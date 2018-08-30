package homeWork;

/**
 * First sets to answers
 */
public class TestArray {

    public void arrayRotation(int values[], int length ,int k){
        /*Integer[] valuesCopy = new int[k];
        System.arraycopy(values, 0, valuesCopy, 0, k);
        System.arraycopy(values, k, values, 0, length-k);
        System.arraycopy(valuesCopy, 0, values, length-k, k);*/

        for (int i = 0; i < k; i++) {

            int valueMove = values[0];
            for (int j = 0; j < length - 1; ++j)
                values[j] = values[j + 1];
            values[length - 1] = valueMove;
        }
        for (int value : values) {
            System.out.print(value + " ");
        }
    }

    public void arrayRestore(int values[], int length){
        for(int i = 0; i < length - 1; ++i){

            if(values[i] < 0){
                if(values[i - 1] < values[i + 1]){
                    values[i] = values[i - 1] + 1;
                }else if(values[i - 1] > values[i + 1]){
                    values[i] = values[i - 1] - 1;
                }
            }
        }
        for (int value : values) {
            System.out.print(value + " ");
        }
    }

    public void range(int values[], int length){
        int arrayBlock[] = new int[length];
        int counter = 0;

        for (int i = 0; i <= length - 1; ++i){
            arrayBlock[counter] = values[i];
            counter++;
            int size = i + 1;

            if (size == length || values[i] + 1 != values[i +1]){
                if (counter > 1){
                    System.out.print("[" + getMaxValue(arrayBlock, counter) + " " + getMinValue(arrayBlock, counter) + "]");
                    counter = 0;
                    arrayBlock = new int[length];
                }if (counter == 1){
                    System.out.print("[" + arrayBlock[0] + "]");
                    counter = 0;
                    arrayBlock = new int[length];
                }
            }
        }
    }

    private int getMaxValue(int[] array, int counter) {
        int maxValue = array[0];
        for (int i = 1; i < counter; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    private int getMinValue(int[] array, int counter) {
        int minValue = array[0];
        for (int i = 1; i < counter; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
