public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Special cases: negative numbers and numbers ending with 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        // Reverse the second half of the number and compare it with the first half
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();
        int x1 = 121;
        int x2 = -121;
        int x3 = 10;

        System.out.println(solution.isPalindrome(x1)); // Output: true
        System.out.println(solution.isPalindrome(x2)); // Output: false
        System.out.println(solution.isPalindrome(x3)); // Output: false
    }
}
