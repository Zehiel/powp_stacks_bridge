package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list_array.StackList;

/**
 * Class implementing functionality of stack
 */
public class Stack implements IStack {

    //Brak konsekwencji dla funkcjonowania programu
    //Latwiejsze utrzymanie kodu (Interfejs)

    //Z tych 3 metod Quick Type Hierarchy jest zdecydowanie najlepszy do dluzszej pracy na jednym pliku,
    //zas metoda z przyciskiem control ma ten sam skutek co metoda ze znalezieniem deklaracji i jest zdecydowanie szybsza
    //a co za tym idzie lepsza do dynamicznej pracy gdy poruszamy sie po projekcie

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
