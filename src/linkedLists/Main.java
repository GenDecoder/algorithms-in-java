package linkedLists;

public class Main {
    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 1;

        Node nodeB = new Node();
        nodeB.data = 2;

        Node nodeC = new Node();
        nodeC.data = 3;

        Node nodeD = new Node();
        nodeD.data = 4;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(
                getListLength(nodeA)
        );
        System.out.println(
                getListLength(nodeB)
        );
    }
    public static int getListLength(Node anode) {
        int size = 1;
        Node currentNode = anode;

        while(currentNode.next != null) {
            size ++;
            currentNode = currentNode.next;
        }

        return size;
    }
}
