package com.company.Stack;

import com.company.Person;

public class Stack {
    public static void main(String[] args) {
        Person person1 = new Person("Wills", 17);
        Person person2 = new Person();
        person2.setName("Adam");
        person2.setId(25);
        Person person3 = new Person("Daniel", 242);
        Person person4 = new Person("Susan", 451);
        Person person5 = new Person("Manny", 3421);

        java.util.Stack<Person> personStack = new java.util.Stack<>();
        // Adding object to a stack (push())
        personStack.push(person1);
        personStack.push(person2);
        personStack.push(person3);
        personStack.push(person4);
        personStack.push(person5);

        // Size of the stack
        System.out.println("Size : " + personStack.size());
        // getting objs from a stack
        // Peep() can be used to get (to peep) the last obj in a stack.
        System.out.println(personStack.peek());
        // gets the first element in the stack
        // get(index) can also be used here.
        System.out.println(personStack.firstElement());

        /*
         * A stack is a data structure that stores data as it comes in in a pile.
         * Like saying a plate being stacked together, the last element that goes in comes out first
         * obj 1 -> popped last
         * obj 2 -> popped second to the last
         * .
         * .
         * obj n -> popped first
         */
        System.out.println("Manny would be removed here -> " + personStack.pop());
        System.out.println("Size reduces by one : " + personStack.size());
        System.out.println("Susan would be removed here -> " + personStack.pop());
        System.out.println("Size reduces by one : " + personStack.size());

        /*
         * Bonus :
         * personStack.empty()   -> empties the stack
         * personStack.search()  -> searches from an obj, if its exists returns its index(count 1).
         * personStack.add(object) -> adds an obj
         * personStack.contain()  -> returns true if an obj exists.
         * Most of the arraylist methods work under stack
         */


    }
}
