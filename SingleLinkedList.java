package LinkedList;

import java.util.Scanner;

public class SingleLinkedList {
    public static void main(String[] args) {
        Node<Integer> node1= new Node<>(10);
        Node<Integer> node2= new Node<>(20);
        Node<Integer> node3= new Node<>(30);
        Node<Integer> node4= new Node<>(40);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Node<Integer> head = node1;
        head= insertAtBegin(head,5);
        head=insertAtBegin(head,1);
        head=insertLast(head,50);
        head=insertLast(head,60);
        head=insertLast(head,70);
        printList(head);
        System.out.println();
        head=deleteBegin(head);
        head=deleteLast(head);
        head=insertPos(head,99,4);
        head=insertPos(head,1,1);
        printList(head);
        System.out.println();
        System.out.println(searchNode(head,1000));

    }

    private static int searchNode(Node<Integer> head,int element){
        int pos=1;
        Node<Integer> curr = head;
        while(curr!=null){
            if(curr.data==element){
                return pos;
            }
            else{
                pos++;
                curr=curr.next;
            }
        }
        return  -1;
    }

    private static Node<Integer> insertPos(Node<Integer> head,int data,int pos){
        Node<Integer> temp = new Node<>(data);
        if(pos==1){
            temp.next=head;
            return temp;
        }
        Node<Integer> curr = head;
        for (int i = 1; i < pos-2; i++) {
            curr = curr.next;
        }
        if(curr==null){
            return  head;
        }
        temp.next=curr.next;
        curr.next = temp;
        return head;
    }

    private static Node<Integer> deleteLast(Node<Integer> head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node<Integer> curr = head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }

    private static Node<Integer> deleteBegin(Node<Integer> head) {
        if(head==null){
            return null;
        }
        head = head.next;
        return head;
    }

    private static Node<Integer> insertLast(Node<Integer> head, int i) {
        Node<Integer> temp = new Node<>(i);
        if (head==null){
            return temp;
        }
        Node<Integer> curr = head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.next=null;
        return head;
    }

    private static void printList(Node<Integer> head) {
        while(head !=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    private static Node<Integer> insertAtBegin(Node<Integer> head,int x){
        Node<Integer> temp = new Node<>(x);
        temp.next = head;
        return temp;
    }
}







