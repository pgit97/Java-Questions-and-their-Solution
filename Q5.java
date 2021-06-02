//Q5.var obj = {
//  “id” : 4, “name” : “abc”,
//  “id” : 10, “name” : “ab2”,
//  “id” : 5, “name” : “abc3”,
//  “id” : 6, “name” : “abc5”
// }



   
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Q5 {
    public static void main(String args[]) {
        Person person1 = new Person();
        person1.setId(4);
        person1.setName("abc");
        Person person2 = new Person();
        person2.setId(10);
        person2.setName("ab2");
        Person person3 = new Person();
        person3.setId(5);
        person3.setName("abc3");
        Person person4 = new Person();
        person4.setId(6);
        person4.setName("abc5");

        List<Person> personList = new ArrayList<Person>();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        System.out.println("\nOriginol Object");
        System.out.println("===============");

        for (Person person : personList) {
            System.out.println("{ id: " + person.getId() + ", name: " + person.getName() + " },");
        }

        System.out.println("\nSortById");
        System.out.println("===============");

        Collections.sort(personList, new SortById());

        for (Person person : personList) {
            System.out.println("{ id: " + person.getId() + ", name: " + person.getName() + " },");
        }

    }
}

class SortById implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int person_id1 = o1.getId();
        int person_id2 = o2.getId();
        if (person_id1 > person_id2) {
            return 1;
        } else if (person_id1 < person_id2) {
            return -1;
        } else
            return 0;
    }
}
