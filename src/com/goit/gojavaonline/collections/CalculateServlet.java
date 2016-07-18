//package com.goit.gojavaonline.collections;
//
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.swing.*;
//import java.awt.*;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.*;
//import java.util.List;
//
//@WebServlet("/CalculateServlet")
//public class CalculateServlet extends HttpServlet {
//    Calculate calc = new Calculate();
//    List<Integer> arrayList = new ArrayList<>();
//    List<Integer> linkedList = new LinkedList<>();
//    Set<Integer> hashSet = new HashSet<>();
//    Set<Integer> treeSet = new TreeSet<>();
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        process(request, response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        process(request, response);
//    }
//
//    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.setStatus(200);
//        int n = Integer.parseInt(request.getParameter("n"));
//        PrintWriter out = response.getWriter();
//
//        Long populateEfficiencyArrayList = calc.listPopulateEfficiency(arrayList, n);
//        Long addEfficiencyArrayList = calc.listAddEfficiency(arrayList);
//        Long containsEfficiencyArrayList = calc.listContainsEfficiency(arrayList);
//        Long getEfficiencyArrayList = calc.listGetEfficiency(arrayList);
//        Long removeEfficiencyArrayList = calc.listRemoveEfficiency(arrayList);
//        Long iteratorAddEfficiencyArrayList = calc.listIteratorAddEfficiency(arrayList,n);
//        Long iteratorRemoveEfficiencyArrayList = calc.listIteratorRemoveEfficiency(arrayList);
//        Long populateEfficiencyLinkedList = calc.listPopulateEfficiency(linkedList, n);
//        Long addEfficiencyLinkedList = calc.listAddEfficiency(linkedList);
//        Long containsEfficiencyLinkedList = calc.listContainsEfficiency(linkedList);
//        Long getEfficiencyLinkedList = calc.listGetEfficiency(linkedList);
//        Long removeEfficiencyLinkedList = calc.listRemoveEfficiency(linkedList);
//        Long listIteratorEfficiencyLinkedList = calc.listIteratorAddEfficiency(linkedList,n);
//        Long iteratorRemoveEfficiencyLinkedList = calc.listIteratorRemoveEfficiency(linkedList);
//        Long populateEfficiencyHashSet = calc.setPopulateEfficiency(hashSet, n);
//        Long addEfficiencyHashSet = calc.setAddEfficiency(hashSet);
//        Long containsEfficiencyHashSet = calc.setContainsEfficiency(hashSet);
//        Long removeEfficiencyHashSet = calc.setRemoveEfficiency(hashSet);
//        Long populateEfficiencyTreeSet = calc.setPopulateEfficiency(treeSet, n);
//        Long addEfficiencyTreeSet = calc.setAddEfficiency(treeSet);
//        Long containsEfficiencyTreeSet = calc.setContainsEfficiency(treeSet);
//        Long removeEfficiencyTreeSet = calc.setRemoveEfficiency(treeSet);
//
//        out.println(
//
//        "<p align=center> Efficiency collections with " + n +" elements</p>"+
//        "<table align=\"center\" border=\"2\" bordercolor = \"#B0E0E6\" width=\"500\">"+
//        "<tr align=center><td></td><td>add</td><td>get</td><td>remove</td><td>contains</td><td>populate</td><td>iterator add</td><td>iterator remove</td></tr>"+
//        "<tr align=center><td>ArrayList</td><td>" + addEfficiencyArrayList + "  </td><td>" + getEfficiencyArrayList + " </td>" +
//        "<td>" + removeEfficiencyArrayList + " </td><td>" + containsEfficiencyArrayList + " </td>" +
//        "<td>" + populateEfficiencyArrayList + "</td><td>"+ iteratorAddEfficiencyArrayList + " </td>" +
//        "<td>" + iteratorRemoveEfficiencyArrayList + "</td></tr>" +
//        "<tr align=center><td>LinkedList</td><td>" + addEfficiencyLinkedList + "</td><td>" + getEfficiencyLinkedList + "</td>" +
//        "<td>" + removeEfficiencyLinkedList + "</td><td>" + containsEfficiencyLinkedList + "</td><td>" + populateEfficiencyLinkedList + "</td>" +
//        "<td>" + listIteratorEfficiencyLinkedList + "</td><td>" + iteratorRemoveEfficiencyLinkedList + "</td></tr>" +
//        "<tr align=center><td>HashSet</td><td>" + addEfficiencyHashSet + "</td><td> </td><td>" + removeEfficiencyHashSet + "</td>" +
//        "<td>" + containsEfficiencyHashSet + "</td><td>" + populateEfficiencyHashSet + "</td><td> </td><td> </td></tr>" +
//        "<tr align=center><td>TreeSet</td><td>" + addEfficiencyTreeSet + "</td><td> </td><td>" + removeEfficiencyTreeSet + "</td>" +
//        "<td>"+ containsEfficiencyTreeSet + "</td><td>" + populateEfficiencyTreeSet + "</td><td> </td><td> </td></tr>" +
//        "</table>"
//        );
//        arrayList.clear();
//        linkedList.clear();
//        hashSet.clear();
//        treeSet.clear();
//
//        String[] columnNames = {
//                "Collection name",
//                "Add",
//                "Get",
//                "Remove",
//                "Contains",
//                "Populate",
//                "Iterator add",
//                "Iterator remove"
//        };
//        String[][] data = {
//                {"ArrayList", addEfficiencyArrayList.toString(), getEfficiencyArrayList.toString(),
//                    removeEfficiencyArrayList.toString(), containsEfficiencyArrayList.toString(),
//                    populateEfficiencyArrayList.toString(), iteratorAddEfficiencyArrayList.toString(),
//                    iteratorRemoveEfficiencyArrayList.toString()},
//                {"LinkedList", addEfficiencyLinkedList.toString(), getEfficiencyLinkedList.toString(),
//                removeEfficiencyLinkedList.toString(), containsEfficiencyLinkedList.toString(),
//                populateEfficiencyLinkedList.toString(), listIteratorEfficiencyLinkedList.toString(),
//                iteratorRemoveEfficiencyLinkedList.toString()},
//                {"HashSet", addEfficiencyHashSet.toString(), " ", removeEfficiencyHashSet.toString(),
//                containsEfficiencyHashSet.toString(), populateEfficiencyHashSet.toString(), " ", " "},
//                {"TreeSet", addEfficiencyTreeSet.toString(), " ", removeEfficiencyTreeSet.toString(),
//                containsEfficiencyTreeSet.toString(), populateEfficiencyTreeSet.toString(), " ", " "}
//        };
//        JFrame frame = new JFrame("Colletions");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JTable table = new JTable(data, columnNames);
//        JScrollPane scrollPane = new JScrollPane(table);
//
//        frame.getContentPane().add(scrollPane);
//        frame.setPreferredSize(new Dimension(450, 200));
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
//}