public class Main {
    public static void main(String[] args) {
        MyList arr = new MyArrayList();
        MyList linkedList = new MyLinkedList();

        arr.add("Tuki");
        arr.add("Hola");
        arr.add("Adios");
        arr.add("String");

        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.indexOf("String"));
        arr.remove("String");
        System.out.println(arr.get(0));
        arr.remove(0);
        System.out.println(arr.get(0));
        System.out.println(arr.size());

        System.out.println("----------------------------------------");

        linkedList.add("index 0");
        linkedList.add("Index 1");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println("-- Quitando el index 0 --");
        linkedList.remove("index 0");
        System.out.println(linkedList.get(0));
    }
}