public class DLL {
    private int size;
    private Node head;
    private Node tail;

    public DLL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if(tail == null){
            tail = head;
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

        Node node = new Node(value, temp.next, temp);
        if(temp.next != null){
            temp.next.prev = node;
        }
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
        lastNode.prev = tail;
        tail = lastNode;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " <--> ");
            temp = temp.next;
        }
        System.out.println("END");
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
        if(temp.next != null){
            temp.next.prev = temp;
        }
        size--;
    }

    public void deleteFirst(){
        if(head == null){
            throw new RuntimeException("List is empty");
        }
        head = head.next;
        if(head != null){
            head.prev = null;
        } else {
            tail = null;
        }
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

        tail = tail.prev;
        tail.next = null;
        size--;
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

}
