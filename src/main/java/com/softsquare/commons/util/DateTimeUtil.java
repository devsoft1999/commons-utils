package com.softsquare.commons.util;
import java.time.Instant;

public class DateTimeUtil {
    public static String nowIsoString() {
        return Instant.now().toString();
    }
}