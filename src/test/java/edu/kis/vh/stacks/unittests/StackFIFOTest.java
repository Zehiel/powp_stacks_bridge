package edu.kis.vh.stacks.unittests;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by grusz on 02.03.2017.
 */
public class StackFIFOTest {

    @Test public void testPop () {
        DefaultStacksFactory factory = new DefaultStacksFactory();
        StackFIFO stackObj = factory.getFIFOStack();
        final int EMPTY_STACK_VALUE = -1;

        int result = stackObj.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue1 = 4;
        stackObj.push(testValue1);
        int testValue2 = 5;
        stackObj.push(testValue2);

        result = stackObj.pop();
        Assert.assertEquals(testValue1, result);
        result = stackObj.pop();
        Assert.assertEquals(testValue2, result);
        result = stackObj.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE,result);
    }
}
