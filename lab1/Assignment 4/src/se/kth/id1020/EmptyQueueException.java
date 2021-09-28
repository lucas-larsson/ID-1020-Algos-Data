package se.kth.id1020;

/**
 * Author:      LUCAS LARSSON.
 * Date:        2021-09-11
 * Description: throws if the queue is empty
 **/
public class EmptyQueueException extends Exception {
    /**
     * Creates an instance of <code>NoElements</code>.
     *
     * @param msg Information regarding the cause of the thrown exception.
     */

    // why is this implantation wrong?
    // public EmptyQueueException (String msg, EmptyQueueException cause) {
    //  super (msg);
    //
    // }

    public EmptyQueueException(String msg) {
        super (msg);
    }
}
