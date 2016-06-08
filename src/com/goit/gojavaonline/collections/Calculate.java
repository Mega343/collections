package com.goit.gojavaonline.collections;


import java.util.*;

public class Calculate {


    ListEfficiency list = new ListEfficiency();
    SetEfficiency set = new SetEfficiency();
    List<Long> time;

    public long listPopulateEfficiency(List<Integer> someList, int n){
        time = new ArrayList<>();
        long result;
        long calc = 0;
        for (int i = 0; i < 100; i++) {
            Date currentTime = new Date();
            list.populate(someList, n);
            Date newTime = new Date();
            long msDelay = newTime.getTime() - currentTime.getTime();
            time.add(msDelay);
            if(i < 99){
                someList.clear();
            }
        }
        for (int i = 0; i < time.size(); i++) {
            calc += time.get(i);
        }
        result = calc/100;
        return result;
    }

    public long listContainsEfficiency(List<Integer> someList) {
        time = new ArrayList<>();
        long result;
        long calc = 0;
        for (int i = 0; i < 2; i++) {
            Date currentTime = new Date();
            list.contains(someList);
            Date newTime = new Date();
            long msDelay = newTime.getTime() - currentTime.getTime();
            time.add(msDelay);
        }
        for (int i = 0; i < time.size(); i++) {
            calc += time.get(i);
        }
        result = calc/100;
        return result;
    }

    public long listGetEfficiency(List<Integer> someList) {
        time = new ArrayList<>();
        long result;
        long calc = 0;
        for (int i = 0; i < 100; i++) {
            Date currentTime = new Date();
            list.get(someList);
            Date newTime = new Date();
            long msDelay = newTime.getTime() - currentTime.getTime();
            time.add(msDelay);
        }
        for (int i = 0; i < time.size(); i++) {
            calc += time.get(i);
        }
        result = calc/100;
        return result;
    }

    public long listAddEfficiency(List<Integer> someList) {
        time = new ArrayList<>();
        long result;
        long calc = 0;
        for (int i = 0; i < 100; i++) {
            Date currentTime = new Date();
            list.add(someList);
            Date newTime = new Date();
            long msDelay = newTime.getTime() - currentTime.getTime();
            time.add(msDelay);
        }
        for (int i = 0; i < time.size(); i++) {
            calc += time.get(i);
        }
        result = calc/100;
        return result;
    }

    public long listRemoveEfficiency(List<Integer> someList) {
        time = new ArrayList<>();
        long result;
        long calc = 0;
        for (int i = 0; i < 100; i++) {
            Date currentTime = new Date();
            list.remove(someList);
            Date newTime = new Date();
            long msDelay = newTime.getTime() - currentTime.getTime();
            time.add(msDelay);
        }
        for (int i = 0; i < time.size(); i++) {
            calc += time.get(i);
        }
        result = calc / 100;
        return result;
    }

    public long listIteratorAddEfficiency(List<Integer> someList, int n) {
            time = new ArrayList<>();
            long result;
            long calc = 0;
            for (int i = 0; i < 100; i++) {
                Date currentTime = new Date();
                list.iteratorAdd(someList, n);
                Date newTime = new Date();
                long msDelay = newTime.getTime() - currentTime.getTime();
                time.add(msDelay);
                if(i <99){
                    someList.clear();
                }
            }
            for (int i = 0; i < time.size(); i++) {
                calc += time.get(i);
            }
            result = calc/100;
            return result;
        }

    public long listIteratorRemoveEfficiency(List<Integer> someList) {
        time = new ArrayList<>();
        long result;
        long calc = 0;
        for (int i = 0; i < 100; i++) {
            Date currentTime = new Date();
            list.iteratorRemove(someList);
            Date newTime = new Date();
            long msDelay = newTime.getTime() - currentTime.getTime();
            time.add(msDelay);
        }
        for (int i = 0; i < time.size(); i++) {
            calc += time.get(i);
        }
        result = calc/100;
        return result;
    }

    public long setPopulateEfficiency(Set<Integer> someSet, int n) {
        time = new ArrayList<>();
        long result;
        long calc = 0;
        for (int i = 0; i < 100; i++) {
            Date currentTime = new Date();
            set.populate(someSet, n);
            Date newTime = new Date();
            long msDelay = newTime.getTime() - currentTime.getTime();
            time.add(msDelay);
            if(i <99){
                someSet.clear();
            }
        }
        for (int i = 0; i < time.size(); i++) {
            calc += time.get(i);
        }
        result = calc/100;
        return result;
    }

    public long setAddEfficiency(Set<Integer> someSet) {
        time = new ArrayList<>();
        long result;
        long calc = 0;
        for (int i = 0; i < 100; i++) {
            Date currentTime = new Date();
            set.add(someSet);
            Date newTime = new Date();
            long msDelay = newTime.getTime() - currentTime.getTime();
            time.add(msDelay);
        }
        for (int i = 0; i < time.size(); i++) {
            calc += time.get(i);
        }
        result = calc/100;
        return result;
    }

    public long setContainsEfficiency(Set<Integer> someSet) {
        time = new ArrayList<>();
        long result;
        long calc = 0;
        for (int i = 0; i < 100; i++) {
            Date currentTime = new Date();
            set.contains(someSet);
            Date newTime = new Date();
            long msDelay = newTime.getTime() - currentTime.getTime();
            time.add(msDelay);
        }
        for (int i = 0; i < time.size(); i++) {
            calc += time.get(i);
        }
        result = calc/100;
        return result;
    }

    public long setRemoveEfficiency(Set<Integer> someSet) {
        time = new ArrayList<>();
        long result;
        long calc = 0;
        for (int i = 0; i < 100; i++) {
            Date currentTime = new Date();
            set.remove(someSet);
            Date newTime = new Date();
            long msDelay = newTime.getTime() - currentTime.getTime();
            time.add(msDelay);
        }
        for (int i = 0; i < time.size(); i++) {
            calc += time.get(i);
        }
        result = calc/100;
        return result;
    }
}
