public interface StackADT<E> {
    void push(E item);

    E peek();

    E pop();

    boolean isEmpty();

}
