package homeWork;

import java.util.Arrays;

/**
 * Created by Gleb on 28.08.18.
 */
public class main {

    public static void main(String[] args) {
        TestArray testArray = new TestArray();

        int arr[] = {5, 2, 3, 4, 6, 5, 7};
        int length = arr.length;
        int k = 2;
        testArray.arrayRotation(arr, length, k);

        System.out.println();

        int arr2[] = {-1, 2, 4, -1, 5, 6, 3, 2, -1, 2};
        int length2 = arr2.length;
        testArray.arrayRestore(arr2, length2);

        System.out.println();

        int arr3[] = {1, 2, 3, 4, 5, 7, 9, 10, 11, 13};
        int length3 = arr3.length;
        testArray.range(arr3,length3);
    }

}
