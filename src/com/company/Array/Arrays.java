package com.company.Array;

import com.company.Person;

public class Arrays {
    public static void main(String[] args) {
        Person person1 = new Person("Wills", 17);
        Person person2 = new Person();
        person2.setName("Adam");
        person2.setId(25);
        // declaration of a Person array tp hold 2 persons objects.
        Person[] persons = new Person[2];
        // An array is static in size, the size of the array has to be determined at declaration.
        // Arrays are limited in terms of what can be done therefore other data structures are preferred.
        // accessing indexes.
        persons[0] = person1;
        persons[1] = person2;

        // displaying content.
        System.out.println("Person 1 : " + persons[0]);
        System.out.println("Person 2 : " + persons[1]);
        System.out.println("*************************");
        // looping through its contents
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
        // size
        System.out.println("Size : " + persons.length);
        // getting data from the persons array
        System.out.println("Person 1 name : " + persons[0].getName());
        System.out.println("Person 1 ID   : " + persons[0].getId());
        // return a boolean(cond - getName and "Wills") being equal.
        // equalsIgnoreCase is used here so the cases are ignored with just focus on the word.
        System.out.println(persons[0].getName().equalsIgnoreCase("Wills"));

    }
}
