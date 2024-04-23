package sit707_week6;

public class ConditionalLoopsExample {

    // Function with a conditional loop (simple instructions in loop body)
    public int sumUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Function with a conditional loop (conditional statement in loop body)
    public int countEvenNumbers(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Function to check if a number is within a specified range
    public boolean isWithinRange(int number, int min, int max) {
        return number >= min && number <= max;
    }
}
