package homeWork;

public class HomeWork2 {

    public String palindrome(String word){
        int backward = word.length() - 1;

        for (int i = 0; backward > i; i++) {
            if(word.charAt(i) != word.charAt(backward)){
                return "isn't palindrome";
            }
            backward--;
        }
        return "is polindrome";
    }

    public void reverse(int i, int j, String letters){
        int counter = 0;
        System.out.print(letters + " - substring " + "\"");
        for (; i <= j; i++){
            System.out.print(letters.charAt(i));
            counter++;
        }
        i = i - counter;
        System.out.print("\"");
        System.out.print(" was reversed to " + "\"");

        for (; j >= i; j--){
            System.out.print(letters.charAt(j));
        }
        System.out.print("\"");
    }

    public int frequency(char letter, String letters){
        int counter = 0;

        for (char chars: letters.toCharArray()) {
            if(letter == chars){
                counter++;
            }
        }
        return counter;
    }
}
