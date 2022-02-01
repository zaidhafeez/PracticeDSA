package revise.linkedList;

public class SLL {

    Node head;
    int size;

    public SLL(){

        this.head = null;
        this.size = 0;

    }

    public void insertAtBegin(int val){

        Node node = new Node(val);
        node.next = head;
        head = node;

        size++;


    }

    public void insertAtEnd(int val){

        Node temp = head;

        if(isEmpty()){
            insertAtBegin(val);
            return;
        }

        while (temp.next != null){

            temp = temp.next;

        }

        Node node = new Node(val);
        node.next = null;
        temp.next = node;

        size++;


    }

    public void insertAtIndex(int val, int index){

        if(index == 0) {
            insertAtBegin(val);
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

        temp.next = new Node(val, temp.next);
        //or//
//        Node node = new Node(val, temp.next);
//        temp.next = node;
        size++;

    }

    public void insertAfterValue(int val, int target){

        Node targetNode = getTargetNode(target);

        if(targetNode == null){
            System.out.println("Item is Not Found");
            return;
        }

        Node node = new Node(val, targetNode.next);
        targetNode.next = node;

        size++;


    }

    private Node getTargetNode(int target) {

        Node temp = head;
        while(temp != null){

            if(temp.val == target) return temp;

            temp = temp.next;

        }

        return null;

    }

    public int delAtbegin() throws Exception {

        if(isEmpty()){

            throw new Exception("List is empty");

        }

        int removed = head.val;
        head = head.next;

        size--;

        return removed;


    }

    public int delAtEnd() throws Exception {

        if(isEmpty()){

            throw new Exception("List is empty");

        }

        if(size <= 1) return delAtbegin();

        Node secondLast = getNode(size - 2);
        int removed = secondLast.next.val;
        secondLast.next = null;

        size--;

        return removed;


    }

    public int delAtIndex(int index) throws Exception {

        if(index == 0) {
            return delAtbegin();
        }
        if(index == size - 1){

            return delAtEnd();
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {

            temp = temp.next;

        }

        int removed = temp.next.val;
        temp.next = temp.next.next;
        //or//
//        Node node = new Node(val, temp.next);
//        temp.next = node;
        size--;

        return removed;

    }

    private Node getNode(int index) {

        Node temp = head;

        for (int j = 0; j < index; j++) {

            temp = temp.next;

        }

        return temp;



    }

//    public Node getIndex(){
//
//        int i = 0;
//        Node temp = head;
//        while(i < size){
//            temp = temp.next;
//            i++;
//        }
//
//        return temp;
//
//    }

    private boolean isEmpty() {

        return head == null;

    }

    public void display() throws Exception {

        if (isEmpty()){

            throw new Exception("List is Empty");

        }

        Node temp = head;
        while(temp != null){

            System.out.print(temp.val + " --> ");
            temp = temp.next;

        }
        System.out.println("END");

    }

    class Node{
        int val;
        Node next;

        public Node(int val){

            this.val = val;

        }

        public Node(int val, Node next){

            this.val = val;
            this.next = next;

        }

    }

}
