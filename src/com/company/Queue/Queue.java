package com.company.Queue;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Integer> integers = new LinkedList<>();
        integers.offer(1);
        integers.offer(2);
        integers.offer(3);
        integers.offer(4);
        integers.offer(5);
        // displays the head on the queue
        System.out.println(integers.peek());
        int removed = integers.poll();
        System.out.println("Integer removed : " + removed);
        // New head
        System.out.println(integers.peek());
        /*
         * Basically in queues data are just added and removed
         * The first object in is the first out,(head out first at poll())
         */

    }
}
