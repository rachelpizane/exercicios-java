package com.rachelparticular.beeCrowd.exc1019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTempoTest {

    ConverterTempo conversor;

    @ParameterizedTest
    @CsvSource({
            "556, '0:9:16\r\n'",
            "1, '0:0:1\r\n'",
            "140153, '38:55:53\r\n'"
    })
    @DisplayName("Convert seconds to hours, minutes and seconds.")
    void expectedConvertSecondsToHoursMinutesAndSeconds(int seg, String expected) {
        conversor = new ConverterTempo(seg);

        String actual = conversor.result();

        assertEquals(actual,expected,String.format("The expected result is %s",expected));
    }
}