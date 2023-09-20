package com.poc;

/**
 * The proposal for the class it is show the basic structure.
 *
 * @author diegoUmpierre
 * @since Sep 19 2023
 */
import java.util.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
    }
    // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
     public boolean hasCycle(SinglyLinkedListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        while (head.next != null) {
            if (list.contains(head.data)) return true;

            list.add(head.data);
            head = head.next;
        }
        if (list.contains(head.data)) return true;
        return false;
    }
}