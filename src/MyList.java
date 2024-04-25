interface MyList {
    int size();
    String get(int index);
    boolean contains(String s);
    boolean add(String s);
    boolean remove(String s);
    boolean remove(int index);
    int indexOf(String s);
}