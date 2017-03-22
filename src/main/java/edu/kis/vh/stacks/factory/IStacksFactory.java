package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public interface IStacksFactory {

    IStack getStandardStack();
    //TODO Implementation of FalseStack - same as in DefaultStackFactory
    IStack getFalseStack();

    StackFIFO getFIFOStack();

    StackHanoi getHanoiStack();

}
