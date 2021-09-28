package se.kth.id1020;

/**
 * Author:      LUCAS LARSSON.
 * Date:        2021-09-14
 **/
    class DoubleLinkedListNode<Item>  {
        private DLLNode head;
        private DLLNode tail;
        private int size;

        public DoubleLinkedListNode(){
            head = new DLLNode(null, null, null);
            tail = new DLLNode(null, head, null);
            head.setNext(tail);
        }

        public int getSize() {
            return size;
        }
        public boolean isEmpty(){
            return (size == 0) ;    //  unnecessary parentheses
        }

        public Item first()throws EmptyQueueException{
            if (isEmpty()) {
                throw new EmptyQueueException(" The Queue is Empty");
            }
            else {
                return (Item) head.getNext().getItem();  // change the cast
            }
        }

        public Item last() throws EmptyQueueException{
            if (isEmpty()) {
                throw new EmptyQueueException("The Queue is Empty");
            }
            else {
                return (Item) tail.getPrev().getItem();  // change the cast
            }
        }

        public void enQueueHead (Item item) throws EmptyQueueException{
            addBetween(item, head, head.getNext());
        }

        public void enQueueTail (Item item) throws EmptyQueueException{
            addBetween (item, tail.getPrev(), tail);
        }

        private void addBetween(Item item, DLLNode current, DLLNode replacement){
            DLLNode newest = new DLLNode(item, current, replacement);
            current.setNext(newest);
            replacement.setPrev(newest);
            size++;
        }

        public Item deQueueHead()throws EmptyQueueException {
            if (isEmpty()) {
                throw new EmptyQueueException("The Queue is Empty");
            }
            else {
                return remove(head.getNext());
            }

        }
        public Item deQueueTail() throws EmptyQueueException {
            if (isEmpty()) {
                throw new EmptyQueueException("The Queue is Empty");
            }
            else {
                return remove(tail.getPrev());
            }
        }
        private Item remove (DLLNode node){
            DLLNode current = node.getPrev();
            DLLNode replacment = node.getNext();
            current.setNext(replacment);
            replacment.setPrev(current);
            size--;
            return (Item) node.getItem();   // change the cast
        }

        public void print()throws EmptyQueueException {
            if (isEmpty()) {
                throw new EmptyQueueException("The Queue is Empty");
            }
            else {
                System.out.println("Pass through the list of items ");
                DLLNode first = head.getNext();


                while (first != tail) {
                    System.out.print("[" + first.getItem()+"]");
                    first = first.getNext();
                }
                System.out.println("the Q size is :" + getSize());
            }
        }
        public void removekth ()throws EmptyQueueException {
            if (isEmpty()) {
                throw new EmptyQueueException("The Queue is Empty");
            } else {
                System.out.println("Pass through the list of items ");
                DLLNode first = head.getNext();


                while (first != tail) {
                    System.out.println("" + first.getItem());
                    if (first.getItem().equals("kth") ){
                        remove(first);
                    }
                    first = first.getNext();
                }
                System.out.println(" \n the Q size is :" + getSize());
            }
        }
    }

