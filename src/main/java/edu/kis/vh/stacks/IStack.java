package edu.kis.vh.stacks;

/**
 * Created by grusz on 22.03.2017.
 */
public interface IStack {
    int EMPTY_STACK_INDICATOR = -1;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
