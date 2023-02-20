package homework3;

public class Main {
    public static void main(String[] args) {

        /*
        разбирался с классом Node
        (не стал удалять так как буду
        еще работать с этим классом для
        тренеровки)
        */

        Node head = new Node(1);
        Node torso = new Node(2);
        Node legs = new Node(3);

        System.out.println("-------");
        System.out.println(head);
        System.out.println(torso);
        System.out.println(legs);

        System.out.println("-------");
        System.out.println(head.getForAddressNextNode());
        System.out.println(torso.getForAddressNextNode());
        System.out.println(legs.getForAddressNextNode());

        System.out.println("-------");
        System.out.println(head.getDataInNode());
        System.out.println(torso.getDataInNode());
        System.out.println(legs.getDataInNode());

        head.setForAddressNextNode(torso);
        torso.setForAddressNextNode(legs);

        System.out.println("-------");
        System.out.println(head.getForAddressNextNode());
        System.out.println(torso.getForAddressNextNode());
        System.out.println(legs.getForAddressNextNode());

        //разбирался как можно итерировать элементы Node
/*
        System.out.println("++++++++++");
        while (head.getForAddressNextNode() != null) {
            System.out.println(head.getDataInNode());
            System.out.println(head.getForAddressNextNode());
            head = head.getForAddressNextNode();
        }
*/

/*
        System.out.println("**********");
        while (head != null) {
            System.out.println(head.getDataInNode());
            System.out.println(head.getForAddressNextNode());
            head = head.getForAddressNextNode();
        }
*/
        //Домашняя работа:
        System.out.println("\n" + "мой однонаправленный связанный список:" + "\n");

        ConnectedListForInteger myConnectedListTypeInteger = new ConnectedListForInteger();

        myConnectedListTypeInteger.add(10);
        myConnectedListTypeInteger.add(12);
        myConnectedListTypeInteger.add(13);
        myConnectedListTypeInteger.add(14);
        myConnectedListTypeInteger.add(15);

        System.out.println("\n" + "размер созданного списка:" + "\n");
        System.out.println(myConnectedListTypeInteger.getSizeConnectedListForInteger());

        System.out.println("\n" + "вывожу весь список:" + "\n");

        for (Integer element: myConnectedListTypeInteger) {

            System.out.println("номер элемента: "
                    + ConnectedListForInteger.ConnectedListForIntegerIterator.getIndexElementList());

            System.out.println("элемент: " + element);
        }
    }
}
