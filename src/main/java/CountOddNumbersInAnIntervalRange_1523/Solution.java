package CountOddNumbersInAnIntervalRange_1523;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int countOdds(int low, int high) {
        List<Integer> primes = new LinkedList<>();
        if (low < 3) {
            primes.add(1);
            low = 2;
        }
        outer:
        for (int i = low; i <= high; i++) {
            for (int j = low; j < i; j++) {
                if (i % j == 0 || i % 2 == 0)
                    continue outer;
            }
            primes.add(i);
        }
        System.out.println("The odd numbers between " + low + " and " + high + " are " + Arrays.toString(primes.toArray()) + ".");
        return primes.size();
    }
}

class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.countOdds(0, 10);
    }
}

