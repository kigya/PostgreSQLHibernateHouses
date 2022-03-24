package com.kigya.valid;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidRooms {
    public static final int MAX_ROOMS = 10;

    public static boolean isValidRooms(int number) {
        return (number > 0 && number <= MAX_ROOMS);
    }
}
