package in.verma.person_project.person;

import java.util.LinkedList;

public class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }


    public static void main (String[]args){
       LinkedList<Person> person = new LinkedList<>();
       person.add(new Person("Коля", 25));
       person.add(new Person("Толя",11));
       person.add(new Person("Саша",67));
       person.add(new Person("Маша",78));
       person.add(new Person("Параша",8));

       Person oldestPerson = findOldestPerson(person);
       System.out.println("Самый старый человек: " + oldestPerson.name);
       System.out.println("Возраст: " + oldestPerson.age + " лет");

       Person youngestPerson = findYoungestPerson(person);
       System.out.println("Самый молодой человек: " + youngestPerson.name);
       System.out.println("Возраст: " + youngestPerson.age + " лет");

    }
    public static Person findOldestPerson(LinkedList<Person>person) {
        Person oldestPerson = person.peekFirst();
        for (Person i : person) {
            if (i.age > oldestPerson.age) {
                oldestPerson = i;
            }
        }
        return oldestPerson;
    }
    public static Person findYoungestPerson(LinkedList<Person>person){
        Person youngestPerson = person.peekFirst();
        for (Person i: person){
            if (i.age < youngestPerson.age) {
                youngestPerson = i;
            }
        }
        return youngestPerson;
    }
}
