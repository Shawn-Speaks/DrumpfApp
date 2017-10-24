package shawn.c4q.nyc.drumpf;

/**
 * Created by shawnspeaks on 10/23/17.
 */

public class TestCalculator {

    interface IntegerMath{
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, IntegerMath op){
        return op.operation(a, b);
    }
}
