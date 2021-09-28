package se.kth.id1020;

/**
 * Author:      LUCAS LARSSON.
 * Date:        2021-09-14
 * Description: linked list that sort the elements im ascending order
 **/
public class SortedLinkedList {
        // reference to first node
        private Node head;
        SortedLinkedList(){
            head = null;
        }

        // Class for nodes
         class Node{
            //data in the node
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
            public void displayData(){
                System.out.print(data + " ");
            }
        }

        public void insert(int data){
            Node newNode = new Node(data);
            Node current = head;
            Node previous = null;
            while(current != null && data > current.data){
                previous = current;
                current = current.next;
            }

            // insertion at beginning of the list
            if(previous == null){
                head = newNode;
            }else{
                previous.next = newNode;
            }
            newNode.next = current;
        }

        public Node remove(){
            if(head == null){
                throw new RuntimeException("List is empty");
            }
            Node temp = head;
            head = head.next;
            return temp;
        }

        // Method to traverse and display all nodes
        public void displayList(){
            Node current = head;
            while(current != null){
                current.displayData();
                current = current.next;
            }
            System.out.println("");
        }

}



