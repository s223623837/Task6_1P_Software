package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "223623837";
		Assert.assertNotNull("Student ID is", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Bidhan babu Gupta";
		Assert.assertNotNull("Student name is", studentName);
	}
	
	@Test
    public void testFalseNumberIsEven() {
        // Test an odd number to ensure isEven returns false
        int oddNumber = 3;
        boolean result = WeatherAndMathUtils.isEven(oddNumber);
        Assert.assertFalse("Number is odd, but isEven returned true", result);
    }

    @Test
    public void testIsEvenTrue() {
        // Test an even number to ensure isEven returns true
        int evenNumber = 4;
        boolean result = WeatherAndMathUtils.isEven(evenNumber);
        Assert.assertTrue("Number is even, but isEven returned false", result);
    }
    
    @Test
    public void testIsEvenFalse() {
        // Test an odd number to ensure isEven returns false
        int oddNumber = 5;
        boolean result = WeatherAndMathUtils.isEven(oddNumber);
        Assert.assertFalse("Number is odd, but isEven returned true", result);
    }
    
    @Test
    public void testCancelWeatherAdvice() {
        // Test scenario with dangerous wind speed and no precipitation
        double windSpeed = 70.1;
        double precipitation = 0.0;
        
        // Invoke the method under test
        String result = WeatherAndMathUtils.weatherAdvice(windSpeed, precipitation);
        
        // Verify that the returned advisory level is "CANCEL"
        Assert.assertEquals("CANCEL", result);
    }
    
    @Test
    public void testWarnWeatherAdvice() {
        // Test scenario with concerning but not dangerous wind speed and precipitation
        double windSpeed = 50.0;
        double precipitation = 3.0;
        
        // Invoke the method under test
        String result = WeatherAndMathUtils.weatherAdvice(windSpeed, precipitation);
        
        // Verify that the returned advisory level is "WARN"
        Assert.assertEquals("WARN", result);
    }

    @Test
    public void testAllClearWeatherAdvice() {
        // Test scenario with safe wind speed and precipitation
        double windSpeed = 30.0;
        double precipitation = 2.0;
        
        // Invoke the method under test
        String result = WeatherAndMathUtils.weatherAdvice(windSpeed, precipitation);
        
        // Verify that the returned advisory level is "ALL CLEAR"
        Assert.assertEquals("ALL CLEAR", result);
    }

    @Test
    public void testDangerousWeatherAdvice() {
        // Test scenario with dangerous wind speed and precipitation
        double windSpeed = 80.0;
        double precipitation = 7.0;
        
        // Invoke the method under test
        String result = WeatherAndMathUtils.weatherAdvice(windSpeed, precipitation);
        
        // Verify that the returned advisory level is "CANCEL"
        Assert.assertEquals("CANCEL", result);
    }

    @Test
    public void testConcerningWeatherAdvice() {
        // Test scenario with concerning but not dangerous wind speed and precipitation
        double windSpeed = 50.0;
        double precipitation = 3.0;
        
        // Invoke the method under test
        String result = WeatherAndMathUtils.weatherAdvice(windSpeed, precipitation);
        
        // Verify that the returned advisory level is "WARN"
        Assert.assertEquals("WARN", result);
    }
    @Test
    public void testNegativeWindSpeed() {
      // Test scenario with negative wind speed (should throw IllegalArgumentException)
      double windSpeed = -50.0;
      double precipitation = 3.0;
      
      // Verify that an IllegalArgumentException is thrown
      Assert.assertThrows(IllegalArgumentException.class, () -> {
        WeatherAndMathUtils.weatherAdvice(windSpeed, precipitation);
      });
    }

    @Test
    public void testNegativePrecipitation() {
      // Test scenario with negative precipitation (should throw IllegalArgumentException)
      double windSpeed = 50.0;
      double precipitation = -3.0;
      
      // Verify that an IllegalArgumentException is thrown
      Assert.assertThrows(IllegalArgumentException.class, () -> {
        WeatherAndMathUtils.weatherAdvice(windSpeed, precipitation);
      });
    }
    @Test
    public void testIsPrimeEvenNumberEarlyReturn() {
        int num = 4; // Even number (should be caught by early return)
        boolean result = WeatherAndMathUtils.isPrime(num);
        Assert.assertFalse("Even number should not be prime", result);
    }
    @Test
    public void testIsPrimeLargePrimeLoop() {
        int num = 103; // Example large odd prime
        boolean result = WeatherAndMathUtils.isPrime(num);
        Assert.assertTrue("Large odd prime number should be prime", result);
    }
    @Test
    public void testIsPrimeLargePrimeIncreasedLoopBound() {
        int num = 101; // Prime number
        boolean result = WeatherAndMathUtils.isPrime(num);
        Assert.assertTrue("Large prime number should be prime", result);
    }
    @Test
    public void testIsPrimeOne() {
        int num = 1;
        boolean result = WeatherAndMathUtils.isPrime(num);
        Assert.assertTrue("Number 1 is considered prime", result);
    }



}
