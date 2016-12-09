package com.java.oops.Abstract;

/**
 * Log Class for Various Logger extended from Logger Abstract.
 */

public class Log extends Logger {

    /**
     * System Log Method.
     * @param line Log String.
     */
    public static void sys (Object line) {
        Logger.sys(line);
    }
}
