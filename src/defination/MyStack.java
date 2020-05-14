package defination;

import adt.StackADT;

public class MyStack<E> implements StackADT<E> {
    public E[] array;
    public int top;
    public int maxSize;

    public MyStack(int s) {
        maxSize = s;
        array = (E[]) new Object[maxSize];
        top = -1;
    }

    @Override
    public void push(E item) {
        array[++top] = item;
    }

    @Override
    public E peek() {
        return array[top];
    }

    @Override
    public E pop() {
        return array[top--];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
