public class CLL {
    private int size;
    private Node head;
    private Node tail;

    public CLL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    public void insert(int index, int value){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }

        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node lastNode = new Node(value);
        tail.next = lastNode;
        tail = lastNode;
        tail.next = head;
        size++;
    }

    public void display(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");
    }

    public void delete(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size - 1){
            deleteLast();
            return;
        }

        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }

    public void deleteFirst(){
        if(head == null){
            throw new RuntimeException("List is empty");
        }
        if(head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }
        head = head.next;
        tail.next = head;
        size--;
    }

    public void deleteLast(){
        if(tail == null){
            throw new RuntimeException("List is empty");
        }
        if(head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }

        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
        size--;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

}
