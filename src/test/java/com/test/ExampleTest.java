package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testJoinFirst() {
        assertEquals("Joined string didn't match", "1 2 3", Example.join("1", "2", "3"));
    }

    @Test(expected = NullPointerException.class)
    public void testJoinSecond() {
        Example.join(null);
    }
}
