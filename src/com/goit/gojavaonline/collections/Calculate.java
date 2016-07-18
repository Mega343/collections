package com.goit.gojavaonline.collections;


import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Calculate {


    ListEfficiency list = new ListEfficiency();
    SetEfficiency set = new SetEfficiency();
    List<Long> time;

    public static void main(String[] args) {
        Calculate calc = new Calculate();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        int n = 10000;
        Long populateEfficiencyArrayList = calc.listPopulateEfficiency(arrayList, n);
        System.out.println("Populate ArrayList complete");
        Long addEfficiencyArrayList = calc.listAddEfficiency(arrayList);
        System.out.println("Add ArrayList complete");
        Long containsEfficiencyArrayList = calc.listContainsEfficiency(arrayList);
        System.out.println("Contains ArrayList complete");
        Long getEfficiencyArrayList = calc.listGetEfficiency(arrayList);
        System.out.println("Get ArrayList complete");
        Long removeEfficiencyArrayList = calc.listRemoveEfficiency(arrayList);
        System.out.println("Remove ArrayList complete");
        Long iteratorAddEfficiencyArrayList = calc.listIteratorAddEfficiency(arrayList,n);
        System.out.println("Iterator add ArrayList complete");
        Long iteratorRemoveEfficiencyArrayList = calc.listIteratorRemoveEfficiency(arrayList);
        System.out.println("Iterator remove ArrayList complete");
        Long populateEfficiencyLinkedList = calc.listPopulateEfficiency(linkedList, n);
        System.out.println("Populate LinkedList complete");
        Long addEfficiencyLinkedList = calc.listAddEfficiency(linkedList);
        System.out.println("Add LinkedList complete");
        Long containsEfficiencyLinkedList = calc.listContainsEfficiency(linkedList);
        System.out.println("Contains LinkedList complete");
        Long getEfficiencyLinkedList = calc.listGetEfficiency(linkedList);
        System.out.println("Get LinkedList complete");
        Long removeEfficiencyLinkedList = calc.listRemoveEfficiency(linkedList);
        System.out.println("Remove LinkedList complete");
        Long listIteratorEfficiencyLinkedList = calc.listIteratorAddEfficiency(linkedList,n);
        System.out.println("Iterator add LinkedList complete");
        Long iteratorRemoveEfficiencyLinkedList = calc.listIteratorRemoveEfficiency(linkedList);
        System.out.println("Iter remove LinkedList complete");
        Long populateEfficiencyHashSet = calc.setPopulateEfficiency(hashSet, n);
        System.out.println("Populate HashSet complete");
        Long addEfficiencyHashSet = calc.setAddEfficiency(hashSet);
        System.out.println("Add hashset complete");
        Long containsEfficiencyHashSet = calc.setContainsEfficiency(hashSet);
        System.out.println("contains hashset complete");
        Long removeEfficiencyHashSet = calc.setRemoveEfficiency(hashSet);
        System.out.println("remove hs complete");
        Long populateEfficiencyTreeSet = calc.setPopulateEfficiency(treeSet, n);
        System.out.println("Populate treeset complete");
        Long addEfficiencyTreeSet = calc.setAddEfficiency(treeSet);
        System.out.println("add treeset complete");
        Long containsEfficiencyTreeSet = calc.setContainsEfficiency(treeSet);
        System.out.println("contains Treeset complete");
        Long removeEfficiencyTreeSet = calc.setRemoveEfficiency(treeSet);
        arrayList.clear();
        linkedList.clear();
        hashSet.clear();
        treeSet.clear();

        String[] columnNames = {
                "Collection name",
                "Add",
                "Get",
                "Remove",
                "Contains",
                "Populate",
                "Iterator add",
                "Iterator remove"
        };
        String[][] data = {
                {"ArrayList", addEfficiencyArrayList.toString(), getEfficiencyArrayList.toString(),
                        removeEfficiencyArrayList.toString(), containsEfficiencyArrayList.toString(),
                        populateEfficiencyArrayList.toString(), iteratorAddEfficiencyArrayList.toString(),
                        iteratorRemoveEfficiencyArrayList.toString()},
                {"LinkedList", addEfficiencyLinkedList.toString(), getEfficiencyLinkedList.toString(),
                        removeEfficiencyLinkedList.toString(), containsEfficiencyLinkedList.toString(),
                        populateEfficiencyLinkedList.toString(), listIteratorEfficiencyLinkedList.toString(),
                        iteratorRemoveEfficiencyLinkedList.toString()},
                {"HashSet", addEfficiencyHashSet.toString(), " ", removeEfficiencyHashSet.toString(),
                        containsEfficiencyHashSet.toString(), populateEfficiencyHashSet.toString(), " ", " "},
                {"TreeSet", addEfficiencyTreeSet.toString(), " ", removeEfficiencyTreeSet.toString(),
                        containsEfficiencyTreeSet.toString(), populateEfficiencyTreeSet.toString(), " ", " "}
        };
        JFrame frame = new JFrame("Colletions");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(450, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
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
            System.out.println("Started calculate list get efficiency");
            Date currentTime = new Date();
            list.get(someList);
            Date newTime = new Date();
            long msDelay = newTime.getTime() - currentTime.getTime();
            time.add(msDelay);
            System.out.println(i+" % complete.");
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
                System.out.println("Started calculate list iterator add efficiency");
                Date currentTime = new Date();
                list.iteratorAdd(someList, n);
                Date newTime = new Date();
                long msDelay = newTime.getTime() - currentTime.getTime();
                time.add(msDelay);
                System.out.println(i+" % complete.");
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
