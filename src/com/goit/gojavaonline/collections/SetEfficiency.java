package com.goit.gojavaonline.collections;


import java.util.Set;

public class SetEfficiency {


    public void add(Set<Integer> set) {
        set.add((int)Math.random()*1000);
    }


    public void contains(Set<Integer> set) {
        for(int i = 0; i < set.size(); i++){
            set.contains(5000);
        }
    }


    public void remove(Set<Integer> set) {
        for(int i = 0; i < set.size(); i++){
            set.remove(0);
        }
    }

    public void populate(Set<Integer> set, int n){
        for (int i = 0; i < n; i++) {
            set.add(i);
        }
    }
}
