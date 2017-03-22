package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list_array.StackList;

public class StackHanoi extends Stack {

    int totalRejected = 0;

    public StackHanoi(StackList stackList) {
        super(stackList);
    }

    public StackHanoi() {
    }

    public int reportRejected() {
        return getTotalRejected();
    }

    @Override
    public void push(int in) {
        if (!isEmpty() && in > top())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.push(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }

    //w srodowisku IntelliJ IDEA odpowiednik skrótu alt+ <- to ctrl+shift+backspace
    //w srodowisku IntelliJ IDEA skroty alt + <- oraz alt + -> powoduja przelaczenie miedzy plikami w wiodku edytora
}
