public class Linkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void printll() {
        Node temp = head;
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void addMid(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        int index = 0;
        Node temp = head;
        while (index < idx - 1) {
            temp = temp.next;
            index++;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty;");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size=0;
            return val;
        }

        Node temp = head;
        int val = -1;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;

        }
        val = temp.next.data;
        tail=temp;
        temp.next = null;
        size--;

        return val;

    }

    public static void main(String args[]) {

        Linkedlist ll = new Linkedlist();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addMid(2, 23);
        ll.addMid(0, 234);
        ll.printll();
        // System.out.println("ll data is removed : " + ll.removeFirst());
        System.out.println("ll last data is removed : " + ll.removeLast());
        ll.printll();

        // System.out.println("size of array is : "+size);

    }

}
