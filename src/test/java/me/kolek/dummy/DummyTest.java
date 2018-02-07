package me.kolek.dummy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DummyTest {
    @Test
    public void testDummy() {
        Dummy dummy = new Dummy();
        dummy.setValue("FooBarBaz");
        assertEquals("zaBraBooF", dummy.getValue(true));
    }
}
