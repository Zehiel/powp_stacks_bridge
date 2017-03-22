package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

    public static void main(String[] args) {
        DefaultStacksFactory factory = new DefaultStacksFactory();

        testStacks(factory);

    }

    private static void testStacks(DefaultStacksFactory factory) {
        IStack[] IStacks = {factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
                factory.getHanoiStack()};

        fillStacks(IStacks);
        fillHanoiStack(IStacks[3]);
        printStacksValues(IStacks);

        //niepotrzebne zlamanie linii po ""
        System.out.println("total rejected is " + ((StackHanoi) IStacks[3]).reportRejected());
    }

    private static void fillStacks(IStack[] IStacks) {
        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                IStacks[j].push(i);
    }

    private static void fillHanoiStack(IStack IStack) {
        //o jeden tab za duzo w liniach 20-28
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            IStack.push(rn.nextInt(20));
    }

    private static void printStacksValues(IStack[] IStacks) {
        for (int i = 0; i < IStacks.length; i++) {
            while (!IStacks[i].isEmpty())
                System.out.print(IStacks[i].pop() + "  ");
            //linia 28 przyklejona do lini 26 utrudniajac zrozumienie kodu, przeniesiona nizej i poprawione wciecie (1 tab za duzo)
            System.out.println();
        }
    }

}
