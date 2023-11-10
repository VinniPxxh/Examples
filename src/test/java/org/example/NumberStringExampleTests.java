package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberStringExampleTests {
    @Test
    public void tests() {
        assertEquals("67", ToString.numberToString(67));
        assertEquals("123", ToString.numberToString(123));
        assertEquals("999", ToString.numberToString(999));
    }
}
