package com.thoughtworks.capability.gtb;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

    public static long getDaysBetweenNextLaborDay(LocalDate date) {

        int year = date.getYear();
        LocalDate laborDay = LocalDate.of(year, 5, 1);
        long days = 0;
        if (date.isBefore(laborDay)) {
            days = date.until(laborDay, ChronoUnit.DAYS);
        } else {
            LocalDate nextLaborDay = laborDay.plusYears(1);
            days = date.until(nextLaborDay, ChronoUnit.DAYS);
        }
        return days;
    }
}
