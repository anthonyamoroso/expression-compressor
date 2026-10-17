package com.anthonyamoroso.kata;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Compressor implements CompressorApi {
    @Override
    public String compress(String expression) {
        StringBuilder stringBuilder = new StringBuilder();
        int charCounter = 1;
        for (int i = 1; i < expression.length(); i++) {
            Character currentChar = expression.charAt(i - 1);
            Character nextChar = expression.charAt(i);
            if (currentChar.equals(nextChar)) {
                charCounter++;
            } else {
                stringBuilder.append(currentChar).append(charCounter);
                charCounter = 1;
            }
            if (i == expression.length() - 1) {
                stringBuilder.append(nextChar).append(charCounter);
            }
        }

        String ex = "eee";
        List<Character> list = new ArrayList<>(ex
                .chars()
                .mapToObj(c -> (char) c)
                .toList());
        list.sort(Comparator.naturalOrder());
        return stringBuilder.toString();
    }
}
