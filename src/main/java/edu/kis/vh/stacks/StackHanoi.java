package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void push(int in) {
        if (!isEmpty() && in > top())
            totalRejected++;
        else
            super.push(in);
    }

    //w srodowisku IntelliJ IDEA odpowiednik skrótu alt+ <- to ctrl+shift+backspace
    //w srodowisku IntelliJ IDEA skroty alt + <- oraz alt + -> powoduja przelaczenie miedzy plikami w wiodku edytora
}
