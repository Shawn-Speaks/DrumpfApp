package shawn.c4q.nyc.drumpf;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.reactivex.Observable;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    String result = "";

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("shawn.c4q.nyc.drumpf", appContext.getPackageName());

    }

    @Test
    public void firstRxTest(){
        result = "";
        Observable<String> observer = Observable.just("Hello");

        observer.subscribe(s -> result=s);
        assertTrue(result.equals("Hello"));

    }
}
