package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

    public static void main(String[] args) {
        DefaultStacksFactory factory = new DefaultStacksFactory();

        Stack[] Stacks = {factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
                factory.getHanoiStack()};

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                Stacks[j].push(i);

        //o jeden tab za duzo w liniach 20-28
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            Stacks[3].push(rn.nextInt(20));

        for (int i = 0; i < Stacks.length; i++) {
            while (!Stacks[i].isEmpty())
                System.out.print(Stacks[i].pop() + "  ");
            //linia 28 przyklejona do lini 26 utrudniajac zrozumienie kodu, przeniesiona nizej i poprawione wciecie (1 tab za duzo)
            System.out.println();
        }
        //niepotrzebne zlamanie linii po ""
        System.out.println("total rejected is " + ((StackHanoi) Stacks[3]).reportRejected());

    }

}
