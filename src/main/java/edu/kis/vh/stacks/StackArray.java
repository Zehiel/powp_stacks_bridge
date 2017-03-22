package edu.kis.vh.stacks;

/**
 * Created by grusz on 16.03.2017.
 */
public class StackArray implements IStack {
    private static final int EMPTY_STACK_INDICATOR = -1;
    private int[] items = new int[12]; //bezposrednie odniesienia do zmiennej zostaly zastapione wywolaniem getterow/setterow

    private int total = EMPTY_STACK_INDICATOR;

    /**
     * puts value on the top of the stack
     * @param i - value of type integer to be pushed into stack
     * modifies:items
     */
    @Override
    public void push(int i) {
        if (!isFull())
            getItems()[++total] = i;
    }

    /**
     * Return boolean indicating if stack is empty
     * @return boolean - true if stack is empty, false if not
     * modifies:none
     */
    @Override
    public boolean isEmpty() {
        return total == EMPTY_STACK_INDICATOR;
    }

    /**
     * Returns boolean indicating if stack is full
     * @return boolean - true if stack is full, false if not
     * modifies:none
     */
    @Override
    public boolean isFull() {
        return total == getItems().length - 1;
    }

    /**
     * returns value on the top of the stack, doesn't modify stack
     * @return value on top of the stack
     * modifies:none
     */
    @Override
    public int top() {
        //TODO Exception based handling
        if (isEmpty())
            return EMPTY_STACK_INDICATOR;
        return getItems()[total];
    }

    /**
     * takes value on the top of the stack, modifies stack
     * @return value on top of the stack
     * modifies:items
     */
    @Override
    public int pop() {
        //TODO Exception based handling
        if (isEmpty())
            return EMPTY_STACK_INDICATOR;
        return getItems()[total--];
    }

    //dzialanie enkapsulacji pola w intelij uniemozliwilo automatyczna generacje gettera dla tego przykladu
    public int getTotal() {
        return total;
    }


    public int[] getItems() {
        return items;
    }

}
