/**
 * Created by bitu on 8/2/17.
 */

class LinkedNode{

    int data;
    LinkedNode next;
}


public class Linkedlist {

    public void printLinkedList(LinkedNode head){

        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public  LinkedNode insertHead(LinkedNode head, int data){

        LinkedNode node = new LinkedNode();
        node.data = data;
        node.next = null;
        if(head!=null){
            node.next = head;
            head = node;
        }


        return head;

    }

    public LinkedNode insertTail(LinkedNode head,int data){

        LinkedNode node = new LinkedNode();
        node.data = data;
        node.next = null;

        LinkedNode ptr = head;
        if (ptr == null)
            return node;


        while(ptr.next!=null){
            ptr = ptr.next;
        }

        ptr.next = node;

        return head;

    }

    public LinkedNode insertPos(LinkedNode head,int data,int pos){

        LinkedNode node = new LinkedNode();
        node.data = data;

        int count =0;
        if (head==null || pos == 0){
            node.next = head;
            return node;
        }

        LinkedNode ptr = head;
        while (ptr!=null){
            if (count == pos){
                node.next = ptr.next;
                ptr.next = node;
                return head;
            }
            ptr = ptr.next;
            count++;

        }

        return head;
    }

    public LinkedNode deleteNode(LinkedNode head,int pos){

        LinkedNode pointer = head;
        if(pos == 0){
            return pointer.next;
        }
        for(int i = 0; i < pos-1; i++){
            pointer = pointer.next;
        }
        if(pointer.next != null){
            pointer.next = pointer.next.next;
        }
        return head;

    }

    public void printRevesre(LinkedNode head){

        if (head!=null){
            printRevesre(head.next);
            System.out.print(head.data);
        }
    }

    public LinkedNode ReverseList(LinkedNode head){

        if (head==null){
            return null;
        }

        LinkedNode prev = null;
        LinkedNode current = head;

        while (current!=null){
            current.next = prev;
            prev = current;
            current = current.next;
        }

        head = prev;
        return head;
    }





}
