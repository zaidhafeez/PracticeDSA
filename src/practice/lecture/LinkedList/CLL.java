package practice.lecture.LinkedList;

public class CLL {

    private Node head;
    private Node tail;

    CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){

        Node node = new Node(val);
        if(head == null){

            head = node;
            tail = node;

        }

        node.next = head;
        tail.next = node;
        tail = node;


    }

    public void delete(int val){

        Node node = head;
        if(node == null) return;
        if(node.val == val){

            head = head.next;
            tail.next = head;
            return;

        }

        do{
            Node n = node.next;
            if(n.val == val){

                node.next = n.next;

            }
            node = node.next;
        }while (node != head);

    }

    public void display(){

        Node temp = head;
        if(head != null){

            do{
                System.out.print(temp.val + " --> ");
                temp = temp.next;
            }while (temp != head);

        }

        System.out.println("HEAD");

    }

    private class Node{

        int val;
        Node next;

        Node(int val){
            this.val = val;
        }

    }

}
