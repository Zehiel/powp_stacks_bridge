package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.list_array.StackArray;
import edu.kis.vh.stacks.list_array.StackList;

/**
 * Created by grusz on 22.03.2017.
 */
public class ListStacksFactory implements IStacksFactory {
    @Override
    public IStack getStandardStack() {
        return new Stack(new StackList());
    }

    @Override
    public IStack getFalseStack() {
        return new Stack(new StackArray());
    }

    @Override
    public StackFIFO getFIFOStack() {
        return new StackFIFO(new StackList());
    }

    @Override
    public StackHanoi getHanoiStack() {
        return new StackHanoi(new StackList());
    }
}
