package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    private static final double tochnost = 1e-4;

    @Test
    public void testSrednee_1_9() {
        Sqrt koren = new Sqrt(9.0);
        assertEquals(5.0, koren.average(1.0, 9.0), tochnost);
    }

    @Test
    public void testSredneeSoOtricatelnym() {
        Sqrt koren = new Sqrt(4.0);
        assertEquals(0.0, koren.average(-10.0, 10.0), tochnost);
    }

    @Test
    public void testSredneeProbnye() {
        Sqrt koren = new Sqrt(4.0);
        assertEquals(4.0, koren.average(3.5, 4.5), tochnost);
    }

    @Test
    public void testGoodVernoDlya49() {
        Sqrt koren = new Sqrt(49.0);
        assertTrue(koren.good(7.0, 49.0));
    }

    @Test
    public void testGoodMalenkieChisla() {
        Sqrt koren = new Sqrt(0.09);
        assertTrue(koren.good(0.3, 0.09));
    }

    @Test
    public void testGoodNevernoFor36() {
        Sqrt koren = new Sqrt(36.0);
        assertFalse(koren.good(5.0, 36.0));
    }

    @Test
    public void testImproveShag36() {
        Sqrt koren = new Sqrt(36.0);
        assertEquals(10.0, koren.improve(2.0, 36.0), tochnost);
        assertEquals(6.0, koren.improve(6.0, 36.0), tochnost);
    }

    @Test
    public void testIterNakhodit36() {
        Sqrt koren = new Sqrt(36.0);
        assertEquals(6.0, koren.iter(1.0, 36.0), tochnost);
    }

    @Test
    public void testKoren49() {
        Sqrt koren = new Sqrt(49.0);
        assertEquals(7.0, koren.calc(), tochnost);
    }

    @Test
    public void testKoren36() {
        Sqrt koren = new Sqrt(36.0);
        assertEquals(6.0, koren.calc(), tochnost);
    }

    @Test
    public void testKorenDrobnogoChisla() {
        Sqrt koren = new Sqrt(0.16);
        assertEquals(0.4, koren.calc(), tochnost);
    }

    @Test
    public void testKorenIrratsionalnogo() {
        Sqrt koren = new Sqrt(11.0);
        assertEquals(Math.sqrt(11.0), koren.calc(), tochnost);
    }
}

