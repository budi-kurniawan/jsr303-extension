package com.brainysoftware.jsr303validator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;

import static org.junit.Assert.*;

import org.junit.Test;

public class PastValidatorForTemporalTest {
    
    @Test
    public void testLocalDateTime() {
        PastValidatorForTemporal validator = new PastValidatorForTemporal();
        LocalDate yesterday = LocalDate.now().minusDays(1);
        assertTrue(validator.isValid(yesterday, null));
        
        LocalDateTime lastHour = LocalDateTime.now().minusHours(1);
        assertTrue(validator.isValid(lastHour, null));
        
        LocalTime lastMinute = LocalTime.now().minusMinutes(1);
        assertTrue(validator.isValid(lastMinute, null));
        
        YearMonth lastMonth = YearMonth.now().minusMonths(1);
        assertTrue(validator.isValid(lastMonth, null));
        
    }

}
