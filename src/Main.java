public class Main {
    public static void main(String[] args) {
        MyList arr = new MyArrayList();

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
    }
}