package com.kigya.valid;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidArea {
    public static final int MAX_AREA = 500;

    public static boolean isValidArea(Double number) {
        return (number > 0 && number <= MAX_AREA);
    }
}
