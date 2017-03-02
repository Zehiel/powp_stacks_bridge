package edu.kis.vh.stacks.unittests;


import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by grusz on 02.03.2017.
 */
public class StackHanoiTest {
    @Test public void testPush() {
        DefaultStacksFactory factory = new DefaultStacksFactory();
        StackHanoi stackObj = factory.getHanoiStack();
        int testValue1 = 5;
        stackObj.push(testValue1);
        int testValue2 = 4;
        stackObj.push(testValue2);
        int testValue3 = 7;
        stackObj.push(testValue3);

        int result = stackObj.top();
        Assert.assertEquals(testValue2, result);
        result = stackObj.getTotalRejected();
        Assert.assertEquals(1,result);
    }
}
