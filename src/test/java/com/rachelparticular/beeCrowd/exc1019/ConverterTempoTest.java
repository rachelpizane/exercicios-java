package com.rachelparticular.beeCrowd.exc1019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTempoTest {

    ConverterTempo conversor;
    int seg;

    @Test
    void result1() {
        seg = 556;
        conversor = new ConverterTempo(seg);

        String actual = conversor.result();
        String expected = "0:9:16\r\n";

        assertEquals(actual,expected,String.format("O resultado esperado era %s",expected));
    }

    @Test
    void result2() {
        seg = 1;
        conversor = new ConverterTempo(seg);

        String actual = conversor.result();
        String expected = "0:0:1\r\n";

        assertEquals(actual,expected,String.format("O resultado esperado era %s",expected));
    }

    @Test
    void result3() {
        seg = 140153;
        conversor = new ConverterTempo(seg);

        String actual = conversor.result();
        String expected = "38:55:53\r\n";

        assertEquals(actual,expected,String.format("O resultado esperado era %s",expected));
    }


}