public class Main {
    public static void main(String[] args) {
        ArrayDeque<Person> arrayDeque = new ArrayDeque<>();
        arrayDeque.addHead(new Student("A",5));
        arrayDeque.addHead(new Student("B",2));
        arrayDeque.addTail(new Student("C",3));
        arrayDeque.addTail(new Student("D",4));
        arrayDeque.addTail(new Student("E",1));
        arrayDeque.printAll();
        arrayDeque.deleteHead();
        arrayDeque.deleteTail();
        arrayDeque.printAll();
        System.out.println(arrayDeque.found(new Student("C",3)));
        arrayDeque.change(1,new Student("A",2));
        System.out.println(arrayDeque.largest());
        System.out.println(arrayDeque.minimum());
        System.out.println(arrayDeque.middle());
        arrayDeque.printAll();
        arrayDeque.addOneElement(new Person("jjk",17));

    }

}
