public class MyLinkedList<T> implements MyList<T>{
    Node<T> head;

    @Override
    public int size() {
        if (head == null){
            return 0;
        }

        Node<T> element = head;

        int i = 1;
        while (element.getNext() != null){
            element = element.getNext();
            i ++;
        }

        return i;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size()) {
            return null;
        }

        if (head == null) {
            return null;
        }

        if (index == 0) {
            return head.getValue();
        }

        Node<T> element = head.getNext();
        for (int i = 1; i < index; i++) {
            element = element.getNext();
        }
        return element.getValue();
    }

    @Override
    public boolean contains(T s) {
        if (head == null)
            return false;

        if (head.getValue().equals(s))
            return true;

        Node<T> element = head.getNext();

        for (int i = 1; i < size(); i++) {
            if (element.getValue().equals(s))
                return true;
            element = element.getNext();
        }

        return false;
    }

    @Override
    public boolean add(T s) {
        Node<T> next = new Node<>(s, null);

        if(head == null) {
            head = next;
        } else {
            getLast().setNext(next);
        }
        return true;
    }

    @Override
    public boolean remove(T s) {
        if (head == null)
            return false;

        if (head.getValue().equals(s))
            head = head.getNext();

        Node<T> element = head.getNext();
        for (int i = 1; i < size() - 1; i++) {
            if (element.getNext().getValue().equals(s)){
                element.setNext(element.getNext().getNext());
            }
        }

        return true;
    }

    @Override
    public boolean remove(int index) {
        if (head == null){
            return false;
        }

        if (index == 0)
            head = head.getNext();

        Node<T> element = head.getNext();

        for (int i = 1; i <= index; i++) {
            if (i == index) {
                element.setNext(element.getNext().getNext());
            }
            element = element.getNext();
        }

        return true;
    }

    @Override
    public int indexOf(T s) {
        if (head == null)
            return 0;
        if (head.getNext() == null)
            return 0;

        int i = 1;
        Node<T> element = head.getNext();
        while (!element.getValue().equals(s)){
            element = element.getNext();
            i ++;
        }
        return i;
    }

    private Node getLast() {
        if (head == null)
            return null;

        Node<T> element = head;
        while (element.getNext() != null) {
            element = element.getNext();
        }

        return element;
    }
}
