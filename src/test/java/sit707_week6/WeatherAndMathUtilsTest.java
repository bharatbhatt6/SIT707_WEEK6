// WeatherAndMathUtilsTest.java
package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "s223148345";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Bharat Bhatt";
        Assert.assertNotNull("Student name is null", studentName);
    }

    @Test
    public void testFalseNumberIsEven() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(3));
    }

    @Test
    public void testTrueNumberIsEven() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(4));
    }

    @Test
    public void testPrimeNumber() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(5));
    }

    @Test
    public void testNonPrimeNumber() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(6));
    }

    @Test
    public void testCancelWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }

    @Test
    public void testWarnWeatherAdvice() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.0, 0.0));
    }

    @Test
    public void testAllClearWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(40.0, 0.0));
    }

    @Test
    public void testCancelWeatherAdviceWithDangerousRainfall() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(60.0, 7.0));
    }

    @Test
    public void testCancelWeatherAdviceWithConcerningWindAndRain() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(50.0, 5.0));
    }

    @Test
    public void testWarnWeatherAdviceWithConcerningWind() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(45.1, 0.0));
    }

    @Test
    public void testWarnWeatherAdviceWithConcerningRainfall() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(0.0, 4.1));
    }

    @Test
    public void testAllClearWeatherAdviceWithSafeConditions() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 3.0));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInputNegativePrecipitation() {
        WeatherAndMathUtils.weatherAdvice(0.0, -5.0);
    }

    @Test
    public void testEdgeCaseAllClearWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(0.0, 0.0));
    }  
    
    @Test
    public void testEdgeCaseDangerousWindAndRain() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.0, 6.0));
    }
}
