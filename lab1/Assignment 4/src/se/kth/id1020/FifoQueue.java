package se.kth.id1020;


/**
 * Author:      LUCAS LARSSON.
 * Date:        2021-09-10
 * Description: FIFO type of Queue class implemented with a double linked circular list.
 **/

class FifoQueue   <Item>  {
    private Node first;     // link to the last recently added node, first in Q
    private Node last;      // link to the most recently added node, last in Q
    private int size;       // counter variable to keep track of the Q size

    // the node class
    private class  Node {
        Item item;
        Node next;
        Node perv;

        private Node (Item item, Node next) {   // change node next to null and prev to prev
            this.item = item;
            this.next = null;
            this.perv = perv;

        }
    }
    public boolean isEmpty() {
        return (this.size == 0); //  unnecessary parentheses
    }


    public int getSize()     {
        return (this.size);  //  unnecessary parentheses
    }         // pretty self-explanatory

    //public Node
    // method to add items to the end of the Q
    public void enQueue( Item item) {
        Node node = new Node(item, this.last);
        if (this.first == null) {
            this.first = node;
            this.size = 1;
        }
        else {
            this.last.next = node;
            this.size ++;
        }
        this.last = node;
    }


    // method to remove items from the beginning of the Q
    public Item deQueue() throws EmptyQueueException {
        if (size == 0) throw new EmptyQueueException(" The Queue is Empty ");
        else {
            Item item = this.peek();
            Node tmp = this.first;
            if (this.first == this.last){
                this.last  = null;
                this.first = null;
            }
            else {
                this.first = this.first.next;
                this.first = null;
            }
            this.size--;
            return item;
        }
    }
    public Item peek() throws EmptyQueueException{
            if (isEmpty()) {
                throw new EmptyQueueException(" The Queue is Empty ");
            }
            else {
                return (this.first.item);
            }
    }

    public void QueueElements() {
        Node node = this.first;
        System.out.println("Queue Elements ");
        while (  node != null ) {
            System.out.println(" " + node.item);
            node = node.next;
         }

    }




}
