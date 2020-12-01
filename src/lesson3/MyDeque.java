package lesson3;

import java.util.EmptyStackException;

public class MyDeque<T> {

    private T[] list;
    private int capacity=100;
    private int head = 0, end = 0, size = 0;

    public MyDeque() {
        this.list = (T[])new Object[this.capacity];
    }

    public MyDeque(int capacity) {
        this.capacity=capacity;
        this.list = (T[])new Object[this.capacity];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (size==0);
    }

    public void pushFront(T element) {
        if (size == capacity) {
            throw new StackOverflowError();
        } else if (size == 0) {
            end = head;
        } else {
            head++;
            if (head >= capacity)
                head = 0;
        }
        list[head] = element;
        size++;
    }

    public void pushBack(T element) {
        if (size == capacity) {
            throw new StackOverflowError();
        } else if (size == 0) {
            head = end;
        } else {
            end--;
            if (end < 0)
                end = capacity - 1;
        }
        list[end] = element;
        size++;
    }

    public T peekBack() {
        if (size != 0)
            return list[end];
        else
            throw new EmptyStackException();
    }

    public T peekFront() {
        if (size != 0)
            return list[head];
        else
            throw new EmptyStackException();
    }

    public T popBack() {
        if (size != 0) {
            T temp = list[end];
            list[end]=null;
            end++;
            if (end >= capacity)
                end = 0;
            size--;
            return temp;
        } else
            throw new EmptyStackException();
    }

    public T popFront() {
        if (size != 0) {
            T temp = list[head];
            list[head]=null;
            head--;
            if (head < 0)
                head = capacity - 1;
            size--;
            return temp;
        } else
            throw new EmptyStackException();
    }

    public void clear() {
        head = 0;
        end = 0;
        size = 0;
        list = (T[])new Object[capacity];
    }

}