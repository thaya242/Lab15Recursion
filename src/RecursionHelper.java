public class RecursionHelper {

    /**
     * Reverses the given string using recursion.
     * @param str The string to be reversed.
     * @return The reversed string.
     */
    public String reverseString(String str) {
        // Base case: if the string is empty or has one character, it’s already "reversed"
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        // Recursive case: last character + reverse of the substring without the last character
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }

    /**
     * Computes the total sum of the cubes of each digit of the number to check if it is an Armstrong number.
     * @param num The number to check.
     * @param total Running total of the cubes of each digit.
     * @return The total sum of the cubes of each digit.
     */
    public int armstrongNumber(int num, int total) {
        // Base case: if there are no more digits left
        if (num == 0) {
            return total;
        }
        // Recursive case: cube the last digit and add to total
        int lastDigit = num % 10;
        return armstrongNumber(num / 10, total + (int)Math.pow(lastDigit, 3));
    }

    /**
     * Checks if the given string is a palindrome using recursion.
     * @param str The string to check.
     * @return True if the string is a palindrome, false otherwise.
     */
    public boolean palindromeChecker(String str) {
        // Base case: if the string is empty or has only one character, it is a palindrome
        if (str.length() <= 1) {
            return true;
        }
        // Recursive case: check first and last characters, and the substring in between
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return palindromeChecker(str.substring(1, str.length() - 1));
        }
        return false;
    }
}
