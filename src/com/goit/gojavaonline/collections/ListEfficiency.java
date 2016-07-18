package com.goit.gojavaonline.collections;

import java.util.*;

public class ListEfficiency {


    public void add(List<Integer> list) {

        list.add(0, 0);
    }

    public void get(List<Integer> list) {
        for(int i = 0; i < list.size(); i++){
            list.get(i);
        }
    }

    public void contains(List<Integer> list) {
        for(int i = 0; i < list.size(); i++){
            list.contains(5000);
        }
    }


    public void remove(List<Integer> list) {
            list.remove(0);
    }

    public void populate(List<Integer> list, int n){
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
    }

    public void iteratorAdd(List<Integer> list, int n){
        ListIterator iterator = list.listIterator();
        for (int i = 0; i < n; i++) {
            iterator.add(i);
        }
    }

    public void iteratorRemove(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        try {

            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }
        catch (Exception e){

        }
    }
}
