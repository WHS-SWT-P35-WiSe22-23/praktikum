package de.whs.swt.wise2223.praktikum.aufgabe9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class MainExceptionTest {
    Main main;


    @Before
    public void before() throws Exception {
        main = new Main();
    }

    @After
    public void after() throws Exception {
        main = null;
    }

    @Test
    public void testWurzelThrowsForNegativeValues() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> main.wurzel(-1));
    }
}
