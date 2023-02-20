package homework3;

public class Node {

    private int data;
    private Node forAddressNextMode;

    public Node(int data) {
        this.data = data;
        forAddressNextMode = null;
    }

    public void setForAddressNextNode(Node forAddressNextMode) {
        this.forAddressNextMode = forAddressNextMode;
    }

    public Node getForAddressNextNode() {
        return forAddressNextMode;
    }

    public int getDataInNode() {
        return data;
    }
}

