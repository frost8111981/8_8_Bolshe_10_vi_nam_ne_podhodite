package com.frost;

import java.util.*;

public class Main {

    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        set.add(19);
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            int i = itr.next();
            if(i > 10){
                itr.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {
       createSet();
        removeAllNumbersGreaterThan10(createSet());

    }
}
