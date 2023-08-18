package in.verma.person_project.person;

import java.util.LinkedList;

public class Person {
    String name;
    String surname;
    int age;


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static void main(String[] args) {
        LinkedList<Person> person = new LinkedList<>();
        person.add(new Person("Махатма", "Ганди", 25));
        person.add(new Person("Такеши", "Китано", 11));
        person.add(new Person("Гена", "Букин", 67));
        person.add(new Person("Фома", "Киняев", 78));
        person.add(new Person("Маркиз", "де Сад", 8));

        Person oldestPerson = findOldestPerson(person);
        System.out.println("Самый старый человек: " + oldestPerson.name + " " + oldestPerson.surname);
        System.out.println("Возраст: " + oldestPerson.age + " лет");

        Person youngestPerson = findYoungestPerson(person);
        System.out.println("Самый молодой человек: " + youngestPerson.name + " " + youngestPerson.surname);
        System.out.println("Возраст: " + youngestPerson.age + " лет");

    }

    public static Person findOldestPerson(LinkedList<Person> person) {
        Person oldestPerson = person.peekFirst();
        for (Person i : person) {
            if (i.age > oldestPerson.age) {
                oldestPerson = i;
            }
        }
        return oldestPerson;
    }

    public static Person findYoungestPerson(LinkedList<Person> person) {
        Person youngestPerson = person.peekFirst();
        for (Person i : person) {
            if (i.age < youngestPerson.age) {
                youngestPerson = i;
            }
        }
        return youngestPerson;
    }

    public static Person startsWithK(LinkedList<Person> person) {
        Person startsWithK = person.peekFirst();
        for (Person i : person) {
            if (i.surname.startsWith("К")) {
                System.out.println(i);
            }
        }
        return startsWithK;
    }
}
