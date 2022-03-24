package com.kigya.valid;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidFloors {
    public static final int MAX_FLOORS = 30;

    public static boolean isValidFloors(int number) {
        return (number > 0 && number <= MAX_FLOORS);
    }
}
