package com.company.Linkedlist;


import com.company.Person;

public class LinkedList {
    // LL -> LinkedList
    public static void main(String[] args) {
        Person person1 = new Person("Wills", 17);
        Person person2 = new Person();
        person2.setName("Adam");
        person2.setId(25);

        // Linked list implementation
        java.util.LinkedList<Person> personLinkedList = new java.util.LinkedList<>();
        // adding objs to a linked list (Similar to that of an Arraylist)
        personLinkedList.add(person1);
        personLinkedList.add(person2);

        // getting data from objects stored in a LL
        // getFirst() returns the first obj in the LL
        System.out.println("Person1  name : " + personLinkedList.getFirst().getName());
        System.out.println("Person1  id   : " + personLinkedList.get(0).getId());
        // both returns the last index on the LL
        System.out.println("Person2  Name : " + personLinkedList.get(1).getName());
        System.out.println("Person2  id   : " + personLinkedList.getLast().getId());

        // removing obj from an LL
        /*
         * personLinkedList.poll() - removes the first obj in the LL (can be displayed - System.out.println(personLinkedList.poll()))
         * personLinkedList.pollFirst() - removes the first obj
         * personLinkedList.pollLast()  - removes the last obj
         */

    }
}
