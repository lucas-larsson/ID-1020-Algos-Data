package se.kth.id1020;

/**
 * Author:      LUCAS LARSSON.
 * Date:        2021-09-14
 * Description: a Exception class in case of the Q is Empty
 **/

    public class EmptyQueueException extends Exception {
        /**
         * Creates an instance of <code>NoElements</code>.
         *
         * @param msg Information regarding the cause of the thrown exception.
         */
        public EmptyQueueException(String msg) {
            super (msg);
        }
    }
