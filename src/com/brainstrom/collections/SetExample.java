package com.brainstrom.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetExample {
    public static void main(String[] args) {
        Consumer<Object> consumer =  cons -> System.out.println(cons);
        Set set =  new HashSet();
        set.add("Pushpendra");
        set.add(12);
        set.add(36.634);
        set.add(65.86f);

        //Older way to iterate set
        for(Iterator it = set.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
        // Newer way to iterate set from Java 8  version
        set.forEach(obj -> consumer.accept(obj));
    }
}
