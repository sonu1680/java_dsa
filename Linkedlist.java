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
            size = 0;
            return val;
        }

        Node temp = head;
        int val = -1;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;

        }
        val = temp.next.data;
        tail = temp;
        temp.next = null;
        size--;

        return val;

    }

    public int itrSearch(int data) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == data) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    public void reverse() {
        Node curr = tail = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public void deleteNthNodeFromLast(int idx) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (idx == size) {
            head = head.next;
            return;
        }
        temp = head;
        int i = 1;
        int idxToFind = size - idx;
        while (i < idxToFind) {

            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return;
    }

    // slow fast approach
    public Node findMid() {

        Node slow = head; // move by +1
        Node fast = head; // move by +2

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

public boolean checkPalidrome(){
if(head==null || head.next==null){
    return true;  //always palidrome as linkedlist is empty
}

Node mid=findMid();
Node curr=mid;
Node prev=null;
Node next;
while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;

}

Node right=prev;
Node left=head;
while(right!=null){
    if(right.data!=left.data){
        return false;
    }
    right=right.next;
    left=left.next;
}
return true;
}

    public static void main(String args[]) {

        Linkedlist ll = new Linkedlist();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        // ll.addMid(2, 23);
        // ll.addMid(0, 234);
        ll.printll();
        System.out.println(ll.checkPalidrome());
        // ll.reverse();
        // ll.deleteNthNodeFromLast(1);
        // ll.printll();
        // System.out.println("ll data is removed : " + ll.removeFirst());
        // System.out.println("ll last data is removed : " + ll.removeLast());
        // System.out.println("size of array is : " + size);
        // System.out.println(ll.itrSearch(2));

    }

}
