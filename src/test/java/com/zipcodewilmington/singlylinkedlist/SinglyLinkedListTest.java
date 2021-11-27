package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testAdd() {
        // given
        SinglyLinkedList list = new SinglyLinkedList();


        // when
        list.add(1);
        list.add(2);
        list.add(3);
        int expected = 3;
        int actual = list.size();

        // then
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testRemove() {
        // given
        SinglyLinkedList list = new SinglyLinkedList();

        // when
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        int expected = 2;
        int actual = list.size();


        // then
        Assert.assertEquals(actual, expected);

    }


    @Test
    public void testContainsTrue() {
        // given
        SinglyLinkedList list = new SinglyLinkedList();


        // when
        list.add(1);
        list.add(2);
        list.add(3);
        boolean actual = list.contains(2);
        // dont need an expected here because you are just asserting something true


        // then
        Assert.assertTrue(actual);
    }

    @Test
    public void testContainsFalse() {
        // given
        SinglyLinkedList list = new SinglyLinkedList();


        // when
        list.add(1);
        list.add(2);
        list.add(3);
        boolean actual = list.contains(9);
        // dont need an expected here because you are just asserting something false


        // then
        Assert.assertFalse(actual);


    }

    @Test
    public void testFind () {
        // given
        SinglyLinkedList list = new SinglyLinkedList();


        // when
        list.add(1);
        list.add(2);
        list.add(3);
        int actual = list.find(2);
        int expected = 1;


        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testSize () {
        // given
        SinglyLinkedList list = new SinglyLinkedList();


        // when
        list.add(1);
        list.add(2);
        list.add(3);
        int actual = list.size();
        int expected = 3;


        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet () {
        // given
        SinglyLinkedList list = new SinglyLinkedList();


        // when
        list.add(1);
        list.add(2);
        list.add(3);
        Object actual = list.get(2);
        int expected = 3;

        // then
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void testCopy () {
//        // given
//
//
//        // when
//
//
//        // then
//
//    }
//
//
//    @Test
//    public void testSort () {
//        // given
//
//
//        // when
//
//
//        // then
//
//    }


}
