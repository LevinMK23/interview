package com.alx.task;

/**
 * Интервал определяесть двамя целыми числами
 *
 * @param timeIn  - время заезда машины
 * @param timeOut - время выезда машины
 */
public record Interval(int timeIn, int timeOut) {

    public static Interval of(int timeIn, int timeOut) {
        return new Interval(timeIn, timeOut);
    }
}

