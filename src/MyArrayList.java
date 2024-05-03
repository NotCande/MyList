public class MyArrayList<T> implements MyList<T>{
    private Object[] arr;

    public MyArrayList() {
        arr = new Object[1];
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public Object get(int index) {
        return (arr.length > index && index >= 0) ? arr[index] : null;
    }

    @Override
    public boolean contains(T s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean add(T s) {
        Object[] elements;
        if (arr[0] == null) {
            arr[0] = s;
        } else {
            int newSize = size() + 1;
            elements = new Object[newSize];

            for (int i = 0; i < arr.length; i++) {
                elements[i] = arr[i];
            }
            elements[newSize - 1] = s;
            arr = elements;
        }

        return true;
    }

    @Override
    public boolean remove(T s) {
        int newSize = size() - 1, elementIndex = indexOf(s);
        Object[] elements = new Object[newSize];

        for (int i = 0; i < elementIndex; i++) {
            elements[i] = arr[i];
        }

        if (elementIndex < arr.length) {
            for (int i = elementIndex + 1; i < arr.length; i++) {
                elements[i] = arr[i];
            }
        }

        arr = elements;
        return true;
    }

    @Override
    public boolean remove(int index) {
        Object[] elements = new Object[arr.length - 1];

        for (int i = 0; i < elements.length; i++) {
            if (i >= index)
                elements[i] = arr[i + 1];
            else
                elements[i] = arr[i];
        }

        arr = elements;
        return true;
    }

    @Override
    public int indexOf(T s) {
        int i = 0;

        while (!arr[i].equals(s)) {
            i ++;
        }

        return i;
    }
}
