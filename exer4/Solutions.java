public class Solution {

    public static void main(String[] args) {
        // Test cases
        System.out.println(solution(5, 5));    // true
        System.out.println(solution(10, 5));   // true
        System.out.println(solution(15, 12));  // true
    }

    // Problem
    // write a recursive function to multiply
    // two positive integers without using * or /
    // you can use addition/subtraction and bit shifting 
    // but minimize the number of operations
    public static int solution(int a, int b) {
        if (b > a) return solution(b, a);
        if (b == 0) return 0;
        if ((b & 1) == 0) {
            return solution(a << 1, b >> 1);
        } else {
            return a + solution(a, b - 1);
        }
    }
}
