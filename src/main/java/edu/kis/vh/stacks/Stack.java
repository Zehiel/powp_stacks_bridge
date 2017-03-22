package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list_array.StackList;

/**
 * Class implementing functionality of stack
 */
public class Stack implements IStack {

    //Brak konsekwencji dla funkcjonowania programu
    //Latwiejsze utrzymanie kodu (Interfejs)

    private StackList stackList;

    public Stack(StackList stackList) {
        this.stackList = stackList;
    }

    public Stack(){
        this.stackList = new StackList();
    }

    public void push(int i) {
        stackList.push(i);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public boolean isFull() {
        return stackList.isFull();
    }

    public int top() {
        return stackList.top();
    }

    public int pop() {
        return stackList.pop();
    }


}
