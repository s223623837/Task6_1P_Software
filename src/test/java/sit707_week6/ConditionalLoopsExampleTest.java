package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalLoopsExampleTest {

    @Test
    public void testSumUpTo() {
        ConditionalLoopsExample example = new ConditionalLoopsExample();
        int result = example.sumUpTo(5);
        Assert.assertEquals(15, result); // Verify sum of first 5 natural numbers
    }

    @Test
    public void testCountEvenNumbers() {
        ConditionalLoopsExample example = new ConditionalLoopsExample();
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int result = example.countEvenNumbers(numbers);
        Assert.assertEquals(3, result); // Verify count of even numbers in the array
    }

    @Test
    public void testIsWithinRange() {
        ConditionalLoopsExample example = new ConditionalLoopsExample();
        
        // Test number within the range
        boolean withinRange = example.isWithinRange(5, 1, 10);
        Assert.assertTrue(withinRange); // 5 is within the range [1, 10]
        
        // Test number outside the range
        boolean outsideRange = example.isWithinRange(15, 1, 10);
        Assert.assertFalse(outsideRange); // 15 is outside the range [1, 10]
        
        // Test number at the boundary of the range
        boolean atBoundary = example.isWithinRange(10, 1, 10);
        Assert.assertTrue(atBoundary); // 10 is within the range [1, 10]
    }
}
