package homeWork;

public class HomeWork1 {

    public void arrayRotationCopy(int values[], int length, int k) {
        int[] valuesCopy = new int[k];
        System.arraycopy(values, 0, valuesCopy, 0, k);
        System.arraycopy(values, k, values, 0, length - k);
        System.arraycopy(valuesCopy, 0, values, length - k, k);

        for (int value : values) {
            System.out.print(value + " ");
        }
    }

    public void arrayRotationFor(int values[], int length, int k) {
        int newArray[] = new int[length];
        int valueRemove = 0;

        for (int i = k; i <= length - 1 ; i++) {
            newArray[valueRemove] = values[i];
            valueRemove++;
        }

        for (int j = 0; j < k; j++) {
            newArray[valueRemove] = values[j];
            valueRemove++;
        }

        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }

    public void arrayRestore(int values[], int length) {
        int i = 0;
        for (; i < length; ++i) {
            if (values[i] <= 0) {
                if (i <= 1) {
                    values[i] = values[i + 1] < values[i + 2] ? values[i + 1] - 1 : values[i + 1] + 1;
                } else values[i] = values[i - 2] < values[i - 1] ? values[i - 1] + 1 : values[i - 1] - 1;
            }
        }
        for (int value : values) {
            System.out.print(value + " ");
        }
    }

    public void range(int values[], int length) {
        int arrayBlock[] = new int[length];
        int counter = 0;

        for (int i = 0; i <= length - 1; ++i) {
            arrayBlock[counter] = values[i];
            counter++;
            int size = i + 1;

            if (size == length || values[i] + 1 != values[i + 1]) {
                if (counter > 1) {
                    System.out.print("[" + getMaxValue(arrayBlock, counter) + " " + getMinValue(arrayBlock, counter) + "]");
                    counter = 0;
                    arrayBlock = new int[length];
                }
                if (counter == 1) {
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
