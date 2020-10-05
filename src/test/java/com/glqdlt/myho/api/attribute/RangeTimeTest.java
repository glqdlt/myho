package com.glqdlt.myho.api.attribute;

import com.glqdlt.myho.api.RangeTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class RangeTimeTest {

    @Test
    void rangeTimeValidation() {
        RangeTime rangeTime = new RangeTime();
        rangeTime.setFrom(LocalDateTime.MIN);
        rangeTime.setTo(LocalDateTime.MAX);
        Assertions.assertTrue(rangeTime.valid());

        RangeTime rangeTime2 = new RangeTime();
        rangeTime2.setFrom(LocalDateTime.MAX);
        rangeTime2.setTo(LocalDateTime.MIN);
        Assertions.assertFalse(rangeTime2.valid());

        RangeTime rangeTime3 = new RangeTime();
        rangeTime3.setFrom(LocalDateTime.MIN);
        rangeTime3.setTo(LocalDateTime.MIN);
        Assertions.assertTrue(rangeTime3.valid());
    }
}