package practice.lecture.LinkedList;

public class DLL {

    private Node head;
    private int size;

    DLL(){
        this.size = 0;
    }

    public void insertAtBegining(int val){

        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if(head != null){
            head.prev = node;
        }

        head = node;

        size++;

    }

    public void insert(int val, int index){

        if(index == 0) {
            insertAtBegining(val);
            return;
        }

        if(index == size - 1){

            insertAtEnd(val);
            return;

        }

        Node temp = head;
        for (int i = 1; i < index; i++) {

            temp = temp.next;

        }

        Node node = new Node(val, temp.next, temp);
        temp.next.prev = node;
        temp.next = node;

        size++;



    }


    public void insertAtEnd(int val){

        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if(head == null){

            node.prev = null;
            head = node;
            size++;
            return;
        }

        while(last.next != null){

            last = last.next;

        }

        last.next = node;
        node.prev = last;

        size++;

    }

    public void insertAfterValue(int target, int value){

        Node p = search(target);

        if(p == null){
            System.out.println("Item Not Found");
            return;
        }

        Node node = new Node(value, p.next, p);
        p.next = node;
        if(node.next != null) node.next.prev = node;

        size++;

    }

    public int getSize(){
        return size;
    }

    private Node search(int target) {

        Node temp = head;
        while(temp != null){

            if(temp.value == target) return temp;
            temp = temp.next;
        }

        return null;
    }

    public void display(){

        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse");
        while(last != null){

            System.out.print(last.value + " --> ");
            last = last.prev;

        }

        System.out.println("START");

    }

    private class Node{

        int value;
        Node next;
        Node prev;

        Node(int value){

            this.value = value;

        }

        Node(int value, Node next, Node prev){

            this.value = value;
            this.next = next;
            this.prev = prev;

        }

    }

}
