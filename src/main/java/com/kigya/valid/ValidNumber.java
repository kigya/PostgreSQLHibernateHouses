package com.kigya.valid;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidNumber {
    public static final int MAX_NUMBER = 300;

    public static boolean isValidNumber(int number) {
        return (number > 0 && number <= MAX_NUMBER);
    }
}
