package edu.kis.vh.stacks.unittests;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.Stack;
import org.junit.Assert;
import org.junit.Test;

//bledy nie wystepuja poniewaz przed kazdym commitem sprawdzana byla poprawnosc dokonanych zmian przy uzyciu nizej zamieszczonych testow

public class StackTest {

    @Test public void testPush() {
        IStack IStackObj = new Stack();
        int testValue = 4;
        IStackObj.push(testValue);

        int result = IStackObj.top();
        Assert.assertEquals(testValue, result);
    }

    @Test public void testIsEmpty() {
        IStack IStackObj = new Stack();
        boolean result = IStackObj.isEmpty();
        Assert.assertEquals(true, result);

        IStackObj.push(888);

        result = IStackObj.isEmpty();
        Assert.assertEquals(false, result);
    }

    @Test public void testIsFull() {
        IStack IStackObj = new Stack();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = IStackObj.isFull();
            Assert.assertEquals(false, result);
            IStackObj.push(888);
        }

        boolean result = IStackObj.isFull();
        Assert.assertEquals(true, result);
    }

    @Test public void testTop() {
        IStack IStackObj = new Stack();
        final int EMPTY_STACK_VALUE = -1;

        int result = IStackObj.top();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        IStackObj.push(testValue);

        result = IStackObj.top();
        Assert.assertEquals(testValue, result);
        result = IStackObj.top();
        Assert.assertEquals(testValue, result);
    }

    @Test public void testPop() {
        IStack IStackObj = new Stack();
        final int EMPTY_STACK_VALUE = -1;

        int result = IStackObj.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        IStackObj.push(testValue);

        result = IStackObj.pop();
        Assert.assertEquals(testValue, result);
        result = IStackObj.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
