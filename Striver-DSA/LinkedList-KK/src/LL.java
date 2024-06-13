public class LL {
    private int size;
    private Node head;
    private Node tail;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
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
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> ");
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
        size--;
    }

    public void deleteFirst(){
        if(head == null){
            throw new RuntimeException("List is empty");
        }
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }

    public void deleteLast(){
        if(head == null){
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
        temp.next = null;
        tail = temp;
        size--;
    }

    public void insertRec(int index, int value){
        head = insertRec(index, value, head);
    }

    private Node insertRec(int index, int value, Node node){
        if(index == 0){
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        node.next = insertRec(index - 1, value, node.next); // Decrement the index by 1
        return node;
    }

    public void removeDuplicates(){
        Node node = head;

        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
                continue;
            }
        }

    }

    public LL merge(LL list1, LL list2){
        Node f = list1.head;
        Node s = list2.head;

        LL ans = new LL();
        while(f.next != null && s.next != null){
            if (f.value > s.value){
                ans.insertLast(s.value);
                f = f.next;
            }else{
                ans.insertLast(f.value);
                s = s.next;
            }
        }

        while(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }

        while(s != null){
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
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
