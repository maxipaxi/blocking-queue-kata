class BlockingQueue<T> {

    /* *** BEGIN: DON'T CHANGE THIS PART *** */
    private T[] _elements;
    private int _head;
    private int _tail;

    BlockingQueue(int size) {
        this((T[]) new Object[size], 0);
    }
    /* *** END: DON'T CHANGE THIS PART *** */

    private BlockingQueue(T[] elems, int tail) {
        _elements = elems;
        _tail = tail;
    }

    void enqueue(T elem) {
        // Todo
    }

    void dequeue() {
        // Todo
    }

    T peek() {
        // Todo
        return (T) "World";
    }

}
