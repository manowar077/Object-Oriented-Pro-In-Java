package LinkedList;
public class LinkedList{
    public class Node{
        int val;
        Node next;
    }
    private Node head;
    private int size;
    private Node tail;

    public void addfirst(int item){
        Node nn=new Node();
        nn.val=item;

        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
}