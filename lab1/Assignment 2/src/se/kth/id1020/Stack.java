package se.kth.id1020;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-09-09
 * Description: a linked list implementation of a stack
 * Disclaimer:  this Node class in entirely taken from the lecture book
 * Algorithms by Robert Sedgewick & Kevin Wayne page 149
 **/

class Stack<Item>{
        private Node first;
        private int size;

        private class Node {
            Item  item;
            Node next;
        }
        public boolean isEmpty() {  return first == null;  }
        // never used
        public int getSize()     {  return size;   }

        public void push( Item item ){
            Node oldFirst = first;
            first = new Node();
            first.item = item;
            first.next = oldFirst;
            size++;
        }
        public Item pop(){
            Item item = first.item;
            first = first.next;
            size--;
            return item;
        }
}
