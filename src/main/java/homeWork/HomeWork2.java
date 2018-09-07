package homeWork;

public class HomeWork2 {

    public String palindrome(String word){
        char[] array = word.toCharArray();
        int backward = array.length - 1;

        for (int i = 0; backward > i; i++) {
            if(array[i] != array[backward]){
                return "isn't palindrome";
            }
            backward--;
        }
        return "is polindrome";
    }

    public void reverse(int i, int j, String letters){
        char quotes = '"';
        int counter = 0;
        System.out.print(letters + " - substring ");
        System.out.print(quotes);
        for (; i <= j; i++){
            System.out.print(letters.charAt(i));
            counter++;
        }
        i = i - counter;
        System.out.print(quotes);
        System.out.print(" was reversed to ");
        System.out.print(quotes);

        for (; j >= i; j--){
            System.out.print(letters.charAt(j));
        }
        System.out.print(quotes);
    }

    public int frequency(char letter, String letters){
        char[] array = letters.toCharArray();
        int counter = 0;

        for (char chars: array) {
            if(letter == chars){
                counter++;
            }
        }
        return counter;
    }
}
