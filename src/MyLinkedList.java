public class MyLinkedList implements MyList{
    StringNode head;

    @Override
    public int size() {
        if (head == null){
            return 0;
        }

        StringNode element = head;

        int i = 0;
        while (element.getNext() != null){
            element = element.getNext();
            i ++;
        }

        return i + 1;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size()) {
            return null;
        }

        if (head == null) {
            return null;
        }

        if (index == 0) {
            return head.getValue();
        }

        StringNode element = head.getNext();
        for (int i = 1; i < index; i++) {
            element = element.getNext();
        }
        return element.getValue();
    }

    @Override

    public boolean contains(String s) {
        if (head == null)
            return false;

        if (head.getValue().equals(s))
            return true;

        StringNode element = head.getNext();

        for (int i = 1; i < size(); i++) {
            if (element.getValue().equals(s))
                return true;
            element = element.getNext();
        }

        return false;
    }

    @Override
    public boolean add(String s) {
        StringNode next = new StringNode(s, null);

        if(head == null) {
            head = next;
        } else {
            getLast().setNext(next);
        }
        return true;
    }

    @Override
    public boolean remove(String s) {
        if (head == null)
            return false;

        if (head.getValue().equals(s))
            head = head.getNext();

        StringNode element = head.getNext();
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

        StringNode element = head.getNext();

        for (int i = 1; i <= index; i++) {
            if (i == index) {
                element.setNext(element.getNext().getNext());
            }
            element = element.getNext();
        }

        return true;
    }

    @Override
    public int indexOf(String s) {
        if (head == null)
            return 0;
        if (head.getNext() == null)
            return 0;

        int i = 1;
        StringNode element = head.getNext();
        while (!element.getValue().equals(s)){
            element = element.getNext();
            i ++;
        }
        return i;
    }

    private StringNode getLast() {
        if (head == null)
            return null;

        StringNode element = head;
        while (element.getNext() != null) {
            element = element.getNext();
        }

        return element;
    }
}
