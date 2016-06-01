package com.goit.gojavaonline.collections;


import java.util.*;

public class Calculate {


    ListEfficiency list = new ListEfficiency();
    SetEfficiency set = new SetEfficiency();
    List<Long> time;

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        System.out.println("Populate ArrayList for 10000: " + calculate.listPopulateEfficiency(arrayList, 10000));
        System.out.println("Add in ArrayList for 10000: " + calculate.listAddEfficiency(arrayList));
        System.out.println("Contains in ArrayList 10000: " + calculate.listContainsEfficiency(arrayList));
        System.out.println("Get ArrayList for 10000: " + calculate.listGetEfficiency(arrayList));
        System.out.println("Remove from ArrayList 10000: " + calculate.listRemoveEfficiency(arrayList));
        System.out.println("Iterator Add ArrayList for 10000: " + calculate.listIteratorAddEfficiency(arrayList,10000));
        System.out.println("Iterator remove ArrayList for 10000: " + calculate.listIteratorRemoveEfficiency(arrayList));
        System.out.println();
        System.out.println("Populate LinkedList for 10000: " + calculate.listPopulateEfficiency(linkedList, 10000));
        System.out.println("Add in LinkedList for 10000: " + calculate.listAddEfficiency(linkedList));
        System.out.println("Contains in LinkedList 10000: " + calculate.listContainsEfficiency(linkedList));
        System.out.println("Get LinkedList for 10000: " + calculate.listGetEfficiency(linkedList));
        System.out.println("Remove from LinkedList 10000: " + calculate.listRemoveEfficiency(linkedList));
        System.out.println("Iterator Add LinkedList for 10000: " + calculate.listIteratorAddEfficiency(linkedList,10000));
        System.out.println("Iterator remove LinkedList for 10000: " + calculate.listIteratorRemoveEfficiency(linkedList));
        System.out.println();
        System.out.println("Hash set populate for 10000 " + calculate.setPopulateEfficiency(hashSet, 10000));
        System.out.println("Hash set add for 10000 " + calculate.setAddEfficiency(hashSet));
        System.out.println("Hash set contains for 10000 " + calculate.setContainsEfficiency(hashSet));
        System.out.println("Hash set remove for 10000 " + calculate.setRemoveEfficiency(hashSet));
        System.out.println();
        System.out.println("Tree set populate for 10000 " + calculate.setPopulateEfficiency(treeSet, 10000));
        System.out.println("Tree set add for 10000 " + calculate.setAddEfficiency(treeSet));
        System.out.println("Tree set contains for 10000 " + calculate.setContainsEfficiency(treeSet));
        System.out.println("Tree set remove for 10000 " + calculate.setRemoveEfficiency(treeSet));
    }

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
