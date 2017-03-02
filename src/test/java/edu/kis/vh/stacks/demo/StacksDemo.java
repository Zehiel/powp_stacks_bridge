package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

    public static void main(String[] args) {
        DefaultStacksFactory factory = new DefaultStacksFactory();

        stack[] stacks = {factory.GetStandardStack(), factory.GetFalseStack(), factory.GetFIFOStack(),
                factory.GetHanoiStack()};

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                stacks[j].push(i);

        //o jeden tab za duzo w liniach 20-28
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            stacks[3].push(rn.nextInt(20));

        for (int i = 0; i < stacks.length; i++) {
            while (!stacks[i].isEmpty())
                System.out.print(stacks[i].pop() + "  ");
            //linia 28 przyklejona do lini 26 utrudniajac zrozumienie kodu, przeniesiona nizej i poprawione wciecie (1 tab za duzo)
            System.out.println();
        }
        //niepotrzebne zlamanie linii po ""
        System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());

    }

}
