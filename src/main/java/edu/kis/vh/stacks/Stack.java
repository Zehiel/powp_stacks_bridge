package edu.kis.vh.stacks;

public class Stack {

    private static final int EMPTY = -1;
    private int[] items = new int[12];

    public int total = EMPTY;

    public void push(int i) {
        if (!isFull())
            items[++total] = i;
    }

    public boolean isEmpty() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == items.length - 1;
    }

    public int top() {
        if (isEmpty())
            return EMPTY;
        return items[total];
    }

    public int pop() {
        if (isEmpty())
            return EMPTY;
        return items[total--];
    }

}
