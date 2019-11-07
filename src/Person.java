public class Person implements Comparable<Person>{
    private String name;
    private int number;
    Person(String name, int number){
        this.name=name;
        this.number=number;
    }
    public String toString(){
        return name+" "+number;
    }

    @Override
    public int compareTo(Person person) {
        return this.number-person.number;
    }
}

