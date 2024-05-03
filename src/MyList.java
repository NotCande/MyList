interface MyList<T> {
    int size();
    Object get(int index);
    boolean contains(T s);
    boolean add(T s);
    boolean remove(T s);
    boolean remove(int index);
    int indexOf(T s);
}