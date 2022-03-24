package com.kigya.valid;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidServiceLife {
    public static final int MAX_SERVICE_LIFE = 100;

    public static boolean isValidServiceLife(int number) {
        return (number > 0 && number <= MAX_SERVICE_LIFE);
    }
}
