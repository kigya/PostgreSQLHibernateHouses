package com.kigya.valid;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidStreet {
    public static final int MAX_LENGTH = 30;

    @Contract(pure = true)
    public static boolean isValidStreet(@NotNull String street) {
        return (street.length() <= MAX_LENGTH);
    }
}
