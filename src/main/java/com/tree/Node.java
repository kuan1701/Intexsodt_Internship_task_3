package main.java.com.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Node {

    private Integer id;
    private String name;
    private Integer parent_id;
    private List<Node> children;

    public Node(Integer id, String name, Integer parent_id) {
        this.id = id;
        this.name = name;
        this.parent_id = parent_id;
        children = new ArrayList<>();
    }

    @Override
    public String toString() {

        StringBuilder buffer = new StringBuilder(50);
        printTree(buffer, "", "");
        return buffer.toString();
    }

    /**
     * Printing the tree structure
     *
     * @param buffer         String
     * @param prefix         String
     * @param childrenPrefix String
     */
    private void printTree(StringBuilder buffer, String prefix, String childrenPrefix) {
        buffer.append(prefix);
        buffer.append(name);
        buffer.append(".").append(parent_id);
        buffer.append(".").append(id);
        buffer.append('\n');

        for (Iterator<Node> it = children.iterator(); it.hasNext(); ) {
            Node next = it.next();
            if (it.hasNext()) {
                next.printTree(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ");
            } else {
                next.printTree(buffer, childrenPrefix + "└── ", childrenPrefix + "    ");
            }
        }
    }

    /**
     * Displaying an array of parent objects
     *
     * @param nodes List<Node>
     * @return List<Node>
     */
    public static List<Node> getObjectTree(List<Node> nodes) {

        List<Node> mainNodeList = new ArrayList<>();

        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).getParent_id() == null) {
                mainNodeList.add(nodes.get(i));
            }

            for (Node node : nodes) {
                if (node.getParent_id() == null) continue;

                if (node.getParent_id().equals(nodes.get(i).getId())) {
                    nodes.get(i).getChildren().add(node);
                }
            }
        }
        return mainNodeList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }
}
