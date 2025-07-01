class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
       
    }
    
}
class LinkedList {
    Node head;
    public void insertFirst(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    public void insertLast(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return;
        }
        Node last;
        last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newnode;
        newnode.prev=last;
        last=newnode;
    }
    public void insertAtPosition(int val, int pos) {
    Node newnode = new Node(val);

    if (pos == 0) {
        insertFirst(val);
        return;
    }

    Node current = head;
    int index = 0;
    while (current != null && index < pos - 1) {
        current = current.next;
        index++;
    }
    if (current == null) {
        System.out.println("Position out of bounds");
        return;
    }
    newnode.next = current.next;
    newnode.prev = current;
    if (current.next != null) {
        current.next.prev = newnode;
    }
    current.next = newnode;
}  
    public boolean search(int val){
        Node node;
        node=head;
        while(node!=null){
            if(node.data==val){
                return true;
            }
            else{
                node=node.next;
            }
        }
        return false;
    }
    public void delete(int val) {
    Node current = head;

    while (current != null) {
        if (current.data == val) {
            // case: deleting the head
            if (current == head) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            }
            // case: deleting middle or end node
            else {
                current.prev.next = current.next;
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            }
            return; // delete only first occurrence
        }
        current = current.next;
    }
}

    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.data + "<->");
            node=node.next;
        }
        System.out.println("null");
    }
    
}
public class DoubleLinkedList{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertFirst(10);
        list.insertFirst(11);
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertLast(5);
        list.insertAtPosition(7,3);
        System.out.println(list.search(25));
        list.delete(5);
        list.display();


    }
}

