package com.company.ArrayList;

import com.company.Person;

import java.util.ArrayList;

public class AL {
    // AL -> Arraylist
    public static void main(String[] args) {
        Person person1 = new Person("Wills", 17);
        Person person2 = new Person();
        person2.setName("Adam");
        person2.setId(25);
        System.out.println(person2.getId());
        ArrayList<Person> personArrayList = new ArrayList<>();
        // adding objects to an AL
        personArrayList.add(person1);
        personArrayList.add(person2);

        // getting data from an AL
        // return the name of the person stored at index 1.
        // NB : an arraylist starts storing from 0,1.....
        System.out.println(personArrayList.get(1).getName());

        // looping through an AL
        for (int i = 0; i < personArrayList.size(); i++) {
            System.out.println("Name : " + personArrayList.get(i).getName());
            System.out.println("ID   : " + personArrayList.get(i).getId());
        }

        // size of an AL
        // returns the size of an AL
        // 0,1 returns a size 2
        // 0,1,2 returns a size 3 ...
        System.out.println("Size : " + personArrayList.size());

        // storing a new obj at an already occupied index
        Person person3 = new Person("Mamba", 34);
        // new obj added at index 1 (person2 originally stored there)
        personArrayList.add(1, person3);
        // result
        // it occupies the assigned index an shifts the previous to the next index (index + 1)
        for (Person person : personArrayList) {
            System.out.println("Name : " + person.getName());
            System.out.println("ID   : " + person.getId());
        }

        // returns the index occupied by person1
        System.out.println("Index of person1 : " + personArrayList.indexOf(person1));

        // checking if an AL contains a specific obj
        // returns a true if yes, otherwise a false
        System.out.println("Is person1 in this AL : " + personArrayList.contains(person1));

        // Bonus
        /**
         * isEmpty() - returns a boolean on if the AL is empty or not ((true) for is empty and (false) for not empty)
         * clear - clears the Al
         * clone
         * equal
         * remove()  - removes the object at the specified index
         * clear()  - clears the AL
         */

    }
}
