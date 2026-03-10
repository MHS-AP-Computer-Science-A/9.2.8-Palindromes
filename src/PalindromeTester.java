public class PalindromeTester {

    /**
     * Returns true if the given string is a palindrome.
     * A palindrome reads the same forward and backward.
     * 
     * Implement this method recursively.
     */
    public static boolean isPalindrome(String str) {

        if(str.length() <= 1){
            return true;
        }
        if(!str.substring(0,1).equals(str.substring(str.length()-1))){
            return false;
        }

        return isPalindrome(str.substring(1, str.length()-1));

        //return false; // placeholder so the code compiles
    }

    public static void main(String[] args) {

        System.out.println("Testing isPalindrome:\n");

        System.out.println("racecar: " + isPalindrome("racecar")); // true
        System.out.println("level: " + isPalindrome("level")); // true
        System.out.println("noon: " + isPalindrome("noon")); // true
        System.out.println("banana: " + isPalindrome("banana")); // false
        System.out.println("hello: " + isPalindrome("hello")); // false
        System.out.println("a: " + isPalindrome("a")); // true
        System.out.println("empty string: " + isPalindrome("")); // true
    }

}
