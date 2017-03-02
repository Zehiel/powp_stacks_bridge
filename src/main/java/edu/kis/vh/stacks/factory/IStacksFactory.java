package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

interface IStacksFactory {

    Stack getStandardStack();
    //TODO Implementation of FalseStack - same as in DefaultStackFactory
    Stack getFalseStack();

    StackFIFO getFIFOStack();

    StackHanoi getHanoiStack();

}
