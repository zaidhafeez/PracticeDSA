package practice.lecture.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public void insertAtBeginning(int val){

        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){

            tail = head;

        }

        size += 1;

    }

    public void insert(int val, int index){

        if(index == 0){

            insertAtBeginning(val);
            return;

        }

        if(index == size){

            insertAtEnd(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {

            temp = temp.next;

        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;


    }

    public void insertAtEnd(int val){


        if(tail == null){

            insertAtBeginning(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;

    }

    public int delAtBegin(){

        int val = head.val;
        head = head.next;

        if(head == null){
            tail = null;
        }

        size--;
        return val;

    }

    public int delAtEnd(){

        if(size <= 1) {
            return  delAtBegin();
        }

        Node secondLast = get(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }


    public int delAtIndex(int index){

        if(index == 0) return delAtBegin();
        if(index == size - 1) return delAtEnd();

        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }

    public Node search(int value){

        Node node = head;

        while (node != null){

            if(node.val == value) return node;
            node = node.next;

        }

        return null;

    }

    public Node get(int index){

        Node temp = head;

        for (int i = 0; i < index; i++) {

            temp = temp.next;

        }

        return temp;

    }


    public void display(){

        Node current = head;
        while(current != null){

            System.out.print(current.val + " --> ");
            current = current.next;

        }

        System.out.println("END");

    }

    private class Node{

        private int val;
        private Node next;

        Node(int val){

            this.val = val;

        }

        Node(int val, Node next){

            this.val = val;
            this.next = next;


        }


    }
}
