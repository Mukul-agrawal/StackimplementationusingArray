package defination;

import adt.StackADT;

public class MyStack<E> implements StackADT<E> {
    public E[] array;
    public int top;
    public int maxSize;

    @Override
    public void push(E item) {

    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
