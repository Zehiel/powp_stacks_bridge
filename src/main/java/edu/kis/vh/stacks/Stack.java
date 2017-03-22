package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list_array.StackArray;
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

    private IStack stack;

    public Stack(StackList stack) {
        this.stack = stack;
    }

    public Stack(StackArray stack){
        this.stack = stack;
    }

    public Stack(){
        this.stack = new StackList();
    }

    public void push(int i) {
        stack.push(i);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int top() {
        return stack.top();
    }

    public int pop() {
        return stack.pop();
    }


}
