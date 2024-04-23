public class Main {
    public static void main(String[] args) {
        MyArrayList arr = new MyArrayList();

        arr.add("Hola");
        arr.add("Adios");
        arr.add("String");

        System.out.println(arr.get(1));
        System.out.println(arr.indexOf("String"));
        arr.remove("String");
        arr.remove(0);
        System.out.println(arr.size());
    }
}

interface MyList {
    int size();
    String get(int index);
    boolean add(String s);
    boolean remove(String s);
    boolean remove(int index);
    int indexOf(String s);
}

class MyArrayList implements MyList {
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
        if (index > 0) {
            return arr.length > index ? arr[index] : null;
        }
        return null;
    }

    @Override
    public boolean add(String s) {
        int newSize = size() + 1;
        String[] elements = new String[newSize];
        if (arr[0] == null) {
            arr[0] = s;
        } else {
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
        int newSize = size() - 1;
        String[] elements = new String[newSize];

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(s)) {
                elements[i] = arr[i];
            }
            else
                i ++;
        }

        arr = elements;

        return true;
    }

    @Override
    public boolean remove(int index) {
        String[] elements = new String[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (i < index - 1)
                elements[i] = arr[i];
            else
                if (i + 1 != arr.length)
                    elements[i] = arr[i + 1];
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