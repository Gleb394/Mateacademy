package homeWork;

/**
 * Created by Gleb on 28.08.18.
 */
public class main {

    public static void main(String[] args) {
        HomeWork1 homeWork1 = new HomeWork1();
        HomeWork2 homeWork2 = new HomeWork2();

        System.out.println("HomeWork1");

        int arr[] = {5, 2, 3, 4, 6, 5, 7};
        int length = arr.length;
        int k = 2;
        homeWork1.arrayRotationCopy(arr, length, k);
        System.out.println();
        int arr1[] = {5, 2, 3, 4, 6, 5, 7};
        int length1 = arr1.length;
        int k1 = 2;
        homeWork1.arrayRotationFor(arr1, length1, k1);

        System.out.println();

        int arr2[] = {-1, 3, 4, 5, 6, 7, -1, 2, 3, -1};
        int length2 = arr2.length;
        homeWork1.arrayRestore(arr2, length2);

        System.out.println();

        int arr3[] = {1, 2, 3, 4, 5, 7, 9, 10, 11, 13};
        int length3 = arr3.length;
        homeWork1.range(arr3,length3);

        System.out.println();

        System.out.println("HomeWork2");

        String word = "madam";
        System.out.println(homeWork2.palindrome(word));

        int i = 2;
        int j = 5;
        String letters = "flspwlvlggflaaa";
        homeWork2.reverse(i, j, letters);

        System.out.println();

        char letter = 'a';
        System.out.println(homeWork2.frequency(letter, letters));
    }
}
