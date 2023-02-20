package homework3;

import java.util.Iterator;

public class ConnectedListForInteger implements Iterable<Integer> {

    private Node head;

    private int sizeList = 0;

    public ConnectedListForInteger() {
        this.head = null;
    }

    public void add(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }
        else
        {
            Node byfferNode = head;

            while (byfferNode.getForAddressNextNode() != null) {
                byfferNode = byfferNode.getForAddressNextNode();
            }

            byfferNode.setForAddressNextNode(newNode);

        }
        sizeList++;
    }

    public int getSizeConnectedListForInteger() {
        return sizeList;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ConnectedListForIntegerIterator();
    }

    protected class ConnectedListForIntegerIterator implements Iterator<Integer> {

        private static int indexElementList = 0;

        public static int getIndexElementList() {
            return indexElementList;
        }

        @Override
        public boolean hasNext() {
            return indexElementList < getSizeConnectedListForInteger();
        }

        @Override
        public Integer next() {

            if (indexElementList != 0) {
                head = head.getForAddressNextNode();
            }

            indexElementList++;

            return head.getDataInNode();
        }
    }
}