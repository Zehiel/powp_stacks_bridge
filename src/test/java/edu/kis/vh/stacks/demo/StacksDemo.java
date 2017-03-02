package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

    public static void main(String[] args) {
        DefaultStacksFactory factory = new DefaultStacksFactory();

        testStacks(factory);

    }

    private static void testStacks(DefaultStacksFactory factory) {
        Stack[] Stacks = {factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
                factory.getHanoiStack()};

        fillStacks(Stacks);
        fillHanoiStack(Stacks[3]);
        printStacksValues(Stacks);

        //niepotrzebne zlamanie linii po ""
        System.out.println("total rejected is " + ((StackHanoi) Stacks[3]).reportRejected());
    }

    private static void fillStacks(Stack[] stacks) {
        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                stacks[j].push(i);
    }

    private static void fillHanoiStack(Stack stack) {
        //o jeden tab za duzo w liniach 20-28
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            stack.push(rn.nextInt(20));
    }

    private static void printStacksValues(Stack[] stacks) {
        for (int i = 0; i < stacks.length; i++) {
            while (!stacks[i].isEmpty())
                System.out.print(stacks[i].pop() + "  ");
            //linia 28 przyklejona do lini 26 utrudniajac zrozumienie kodu, przeniesiona nizej i poprawione wciecie (1 tab za duzo)
            System.out.println();
        }
    }

}
