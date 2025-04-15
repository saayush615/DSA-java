package DSA.Linkedlist.Theory;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    //1. Insert a node at first (3)
    public void insertFirst(int val){
        Node node = new Node(val); // create a node
        node.next = head; // add next node to head
        head = node; //now add head to the newly added node(bcoz head always points to first node)

        if (tail == null){
            tail = head; //if tail is null the tail = head
        }

        size += 1; // increase size by 1 since 1 val is added
    }

    //2. Insert at last (4)
    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //3. insert at perticular index(5)
    public void insert(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        
        Node temp = head; // ****IMP
        for (int i = 1; i < index ; i++) {
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

//    4.Remove first index (6)
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val; // return the val that is removed
    }

    //get to a particular index(7)
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

//    5. delete last
    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

//    6. delete a particular index
    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

//    7. find a particular node that have this value
    public Node find(int value){
        Node node = head;
        while(node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return node;
    }

    //display node (2) (Java Function to traverse and print the elements of the linked list)
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;

        }
        System.out.println("End");
    }

    // Node class (1)
    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
