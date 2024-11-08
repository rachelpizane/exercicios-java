package com.rachelparticular.beeCrowd.exc1018;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CedulasTest {
    @Test
    void testSolutionExc1008(){
        String actual = Cedulas.solutionExc1008(576);
        String expected =
                "576\r\n" +
                "5 nota(s) de R$ 100,00\r\n" +
                "1 nota(s) de R$ 50,00\r\n" +
                "1 nota(s) de R$ 20,00\r\n" +
                "0 nota(s) de R$ 10,00\r\n" +
                "1 nota(s) de R$ 5,00\r\n" +
                "0 nota(s) de R$ 2,00\r\n" +
                "1 nota(s) de R$ 1,00\r\n";

        assertEquals(expected,actual);
    }

}