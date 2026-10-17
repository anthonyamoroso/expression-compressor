package com.anthonyamoroso.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompressorTest {

    private final Compressor compressor = new Compressor();

    @Test
    void should_compress_expression() {
        // Given
        String expression = "aaaabbbcca";
        String expected = "a4b3c2a1";

        // When
        String result = compressor.compress(expression);

        // Then
        assertEquals(expected, result);
    }

}