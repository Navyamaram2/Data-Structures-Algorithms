class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void insertFirst(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;

    }
    public void delete(int val){
        if(head==null){
            return;
        }
        if(head.data==val){
            head=head.next;
            return;
        }
        Node current=head;
        while(current.next!=null){
            if(current.next.data==val){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }

    }
    public boolean search(int val) {
        Node current = head;
        while (current != null) {
            if (current.data == val) {
                    return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data +"->");
            current=current.next;
        }
        System.out.print("End");
    }
}
public class singleLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(10);
        list.delete(9);
        System.out.println(list.search(10));
        list.display();

        
    }
    
}
