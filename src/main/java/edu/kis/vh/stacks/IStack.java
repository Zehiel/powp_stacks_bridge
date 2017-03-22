package edu.kis.vh.stacks;

/**
 * Created by grusz on 22.03.2017.
 */
public interface IStack {
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
