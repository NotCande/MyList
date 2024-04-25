public class MyArrayList implements MyList{
    private String [] arr;

    public MyArrayList() {
        arr = new String[1];
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public String get(int index) {
        return (arr.length > index && index >= 0) ? arr[index] : null;
    }

    @Override
    public boolean contains(String s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean add(String s) {
        String[] elements;
        if (arr[0] == null) {
            arr[0] = s;
        } else {
            int newSize = size() + 1;
            elements = new String[newSize];

            for (int i = 0; i < arr.length; i++) {
                elements[i] = arr[i];
            }
            elements[newSize - 1] = s;
            arr = elements;
        }

        return true;
    }

    @Override
    public boolean remove(String s) {
        int newSize = size() - 1, elementIndex = indexOf(s);
        String[] elements = new String[newSize];

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
        String[] elements = new String[arr.length - 1];

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
    public int indexOf(String s) {
        int i = 0;

        while (!arr[i].equals(s)) {
            i ++;
        }

        return i;
    }
}
