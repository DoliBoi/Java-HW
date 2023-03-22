package cz.cvut.fel.pjv;



/**
 * Implementation of the {@link Queue} backed by fixed size array.
 */
public class CircularArrayQueue implements Queue {

    private int setCapacity = 5;
    private int head, tail, count;
    private String[] array;
    /**
     * Creates the queue with capacity set to the value of 5.
     */
    public CircularArrayQueue() {
        
        head = tail = count = 0;
        array = new String[setCapacity];
    }


    /**
     * Creates the queue with given {@code capacity}. The capacity represents maximal number of elements that the
     * queue is able to store.
     * @param capacity of the queue
     */
    public CircularArrayQueue(int capacity) {
        head = tail = count = 0;
        this.setCapacity = capacity;
        array = new String[setCapacity];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    @Override
    public boolean isFull() {
        return count == setCapacity;
    }

    @Override
    public boolean enqueue(String obj) {

        if (isFull()) {
            return false;
        }
        else if (obj != null) {
            count++;
            tail = (tail + 1) % setCapacity;
            array [tail] = obj;
            return true;
        }
        return false;
    }

    @Override
    public String dequeue() {
        if(!isEmpty()) {
            head = (head + 1) % setCapacity;
            count--;
            return array[head];
        }
        return null;
    }

    @Override
    public void printAllElements() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[(head + i) % setCapacity]);
        } 

    }
}
