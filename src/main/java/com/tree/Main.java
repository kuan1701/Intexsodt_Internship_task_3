package main.java.com.tree;

public class Main {

    public static void main(String[] args) {

        System.out.println("Tree: name.parent_id.id");
        System.out.println(Node.getObjectTree(NodeStorage.getNodeList()));
    }
}
