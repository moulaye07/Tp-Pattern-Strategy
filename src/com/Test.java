package com;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String args[]) throws InterruptedException {

        // we can provide any strategy to do the sorting
        int[] array = {4, 3, 2, 1, 5 };
        Context ctx = new com.Context(new BubbleSort());
        ctx.arrange(array);

        //We can change the strategy without changing context class
        ctx = new com.Context(new QuickSort());
        ctx.arrange(array);


        // Object part
        List<Object> objects = new ArrayList<Object>();
        objects.add(new Object("toto", 22, 222));
        objects.add(new Object("tata", 222, 1));
        objects.add(new Object("alice", 4, 22));
        objects.add(new Object("bob", 9, 18));
        // we can provide any strategy to do the sorting
        Context2 ctx2 = new Context2(new SortByName());
        ctx2.arrange(objects);

        //We can change the strategy without changing context class
        ctx2 = new Context2(new SortByPrice());
        ctx2.arrange(objects);

        //try it yourself then...
    }
}
