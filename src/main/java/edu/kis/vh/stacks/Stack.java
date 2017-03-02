package edu.kis.vh.stacks;

public class Stack {

    private static final int EMPTY_STACK_INDICATOR = -1;
    private int[] items = new int[12]; //bezposrednie odniesienia do zmiennej zostaly zastapione wywolaniem getterow/setterow

    private int total = EMPTY_STACK_INDICATOR;

    public void push(int i) {
        if (!isFull())
            getItems()[++total] = i;
    }

    public boolean isEmpty() {
        return total == EMPTY_STACK_INDICATOR;
    }

    public boolean isFull() {
        return total == getItems().length - 1;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_STACK_INDICATOR;
        return getItems()[total];
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_STACK_INDICATOR;
        return getItems()[total--];
    }

    //dzialanie enkapsulacji pola w intelij uniemozliwilo automatyczna generacje gettera dla tego przykladu
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }
}
