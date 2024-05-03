public class Main {
    public static void main(String[] args) {
        MyList<String> arr = new MyArrayList<>();
        MyList<String> linkedList = new MyLinkedList<>();

        arr.add("Tuki");
        arr.add("Hola");
        arr.add("Adios");
        arr.add("String");

        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println("El arraylist tiene 'String'? " + arr.contains("String"));
        System.out.println(arr.indexOf("String"));
        arr.remove("String");
        System.out.println(arr.get(0));
        arr.remove(0);
        System.out.println(arr.get(0));
        System.out.println(arr.size());

        System.out.println("----------------------------------------");

        linkedList.add("index 0");
        linkedList.add("Index 1");
        System.out.println("El linked list contiene 'index 0'? " + linkedList.contains("index 0"));
        System.out.println(linkedList.get(0));
        System.out.println("El linked list contiene 'Index 1'? " + linkedList.contains("Index 1"));
        System.out.println(linkedList.get(1));
        System.out.println("El linked list contiene 'Hola'? " + linkedList.contains("Hola"));
        linkedList.add("Hola");
        System.out.println("'Hola' añadido.");
        System.out.println("tamaño: " + linkedList.size());
        System.out.println(linkedList.get(2));
        System.out.println("Indice de 'Hola': " + linkedList.indexOf("Hola"));
        System.out.println("-- Quitando el index 0 --");
        linkedList.remove("index 0");
        System.out.println("Nuevo indice 0: " + linkedList.get(0));
        System.out.println("Nuevo indice de 'Hola': " + linkedList.indexOf("Hola"));
        linkedList.add("prueba 1");
        linkedList.add("objetivo");
        linkedList.add("prueba 2");
        System.out.println(linkedList.indexOf("objetivo"));
    }
}