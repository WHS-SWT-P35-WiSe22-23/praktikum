package de.whs.swt.wise2223.praktikum.aufgabe9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class MainHappyPathTest {
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
    public void testWurzelWorksForPotenzOfBase2() throws Exception {
        for (int i = 1; i < 10; i *= 2) {
            assertEquals(main.wurzel((float) Math.pow(i, 2)), i, 0.1);
        }
    }

    @Test
    public void testWurzelFuzzy() throws Exception {
        final Random random = new Random();
        for (int i = 1; i < 10_000; i++) {
            float f = random.nextFloat();
            assertEquals(main.wurzel((float) Math.pow(f, 2)), f, 0.1);
        }
    }
}
