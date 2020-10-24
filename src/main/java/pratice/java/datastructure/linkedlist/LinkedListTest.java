package pratice.java.datastructure.linkedlist;


/**
 * Created by patrick on 2015/10/27.
 * Copyright @ EEGSmart
 */
public class LinkedListTest {
    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();
        linkedList.add(new LinkedList.Node("1"));
        linkedList.add(new LinkedList.Node("2"));
        linkedList.add(new LinkedList.Node("3"));
        linkedList.add(new LinkedList.Node("4"));

        LinkedList.Node current = head;
        int length = 0;
        LinkedList.Node middle = head;

        while(current.next() !=null){
            length++;
            if(length%2==0){
                middle = middle.next();
            }
            current = current.next();
        }

        if(length%2 == 1){
            middle = middle.next();
        }
        System.out.println("length of LinkedList: "+ length);
        System.out.println("middle element of LinkedList: "+middle);



    }
}


