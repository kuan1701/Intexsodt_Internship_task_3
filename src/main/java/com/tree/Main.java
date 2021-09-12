package main.java.com.tree;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Node node1 = new Node(1, "A", null);
        Node node2 = new Node(2, "B", null);
        Node node3 = new Node(3, "C", 1);
        Node node4 = new Node(4, "D", 2);
        Node node5 = new Node(5, "E", 2);
        Node node6 = new Node(6, "F", 2);
        Node node7 = new Node(7, "G", 3);
        Node node8 = new Node(8, "H", 3);
        Node node9 = new Node(9, "I", 1);
        Node node10 = new Node(10, "K", 4);
        Node node11 = new Node(11, "L", 2);
        Node node12 = new Node(12, "M", 10);
        Node node13 = new Node(13, "M", 6);
        Node node14 = new Node(14, "M", 13);

        List<Node> nodes = new ArrayList<>();
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        nodes.add(node5);
        nodes.add(node6);
        nodes.add(node7);
        nodes.add(node8);
        nodes.add(node9);
        nodes.add(node10);
        nodes.add(node11);
        nodes.add(node12);
        nodes.add(node13);
        nodes.add(node14);

        System.out.println("Tree: name.parent_id.id");
        System.out.println(Node.getObjectTree(nodes));
    }
}
