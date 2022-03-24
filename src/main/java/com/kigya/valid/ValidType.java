package com.kigya.valid;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidType {
    public static final int MAX_LENGTH = 50;

    @Contract(pure = true)
    public static boolean isValidType(@NotNull String type) {
        return (type.length() <= MAX_LENGTH);
    }
}
