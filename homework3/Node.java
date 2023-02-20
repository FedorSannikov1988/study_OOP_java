package homework3;

public class Node {

    private int data;
    private Node forAddressNextNode;

    public Node(int data) {
        this.data = data;
        forAddressNextNode = null;
    }

    public void setForAddressNextNode(Node forAddressNextNode) {
        this.forAddressNextNode = forAddressNextNode;
    }

    public Node getForAddressNextNode() {
        return forAddressNextNode;
    }

    public int getDataInNode() {
        return data;
    }
}

