package main.java.com.tree;

import java.util.ArrayList;
import java.util.List;

public class NodeStorage {

    private static final List<Node> nodeList = new ArrayList<>();

    private static final Node node1 = new Node(1, "A", null);
    private static final Node node2 = new Node(2, "B", null);
    private static final Node node3 = new Node(3, "C", 1);
    private static final Node node4 = new Node(4, "D", 2);
    private static final Node node5 = new Node(5, "E", 2);
    private static final Node node6 = new Node(6, "F", 2);
    private static final Node node7 = new Node(7, "G", 3);
    private static final Node node8 = new Node(8, "H", 3);
    private static final Node node9 = new Node(9, "I", 1);
    private static final Node node10 = new Node(10, "K", 4);
    private static final Node node11 = new Node(11, "L", 2);
    private static final Node node12 = new Node(12, "M", 10);
    private static final Node node13 = new Node(13, "M", 6);
    private static final Node node14 = new Node(14, "M", 13);

    public static List<Node> getNodeList() {
        nodeList.add(node1);
        nodeList.add(node2);
        nodeList.add(node3);
        nodeList.add(node4);
        nodeList.add(node5);
        nodeList.add(node6);
        nodeList.add(node7);
        nodeList.add(node8);
        nodeList.add(node9);
        nodeList.add(node10);
        nodeList.add(node11);
        nodeList.add(node12);
        nodeList.add(node13);
        nodeList.add(node14);
        return nodeList;
    }
}
