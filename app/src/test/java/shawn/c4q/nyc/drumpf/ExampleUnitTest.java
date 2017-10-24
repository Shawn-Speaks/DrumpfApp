package shawn.c4q.nyc.drumpf;

import org.junit.Before;
import org.junit.Test;

import io.reactivex.Observable;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private String result;
    TestCalculator calculator;
    @Before
    public void setupCalculator(){
        calculator = new TestCalculator();
    }

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void firstRxTest(){
        result = "";
        Observable<String> observer = Observable.just("Hello");

        observer.subscribe(s -> result = s);
        assertEquals(result, "Hello");
    }

   @Test
    public void testRxSubtraction(){
       TestCalculator.IntegerMath subtraction = (a, b) -> a - b;
       assertEquals(100, calculator.operateBinary(300, 200, subtraction));
   }

   @Test
    public void testRxAddition(){
       TestCalculator.IntegerMath addition = (a, b) -> a + b;
        assertEquals(500, calculator.operateBinary(250, 250, addition));
   }


}