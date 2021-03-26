package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeUtilsTest {
    private TimeUtils timeUtils;

    @Before
    public void setUp() {
        timeUtils = new TimeUtils();
    }

    @Test
    public void shouldConvertCorrectly() throws Exception {
        assertEquals("1 1 1 1", timeUtils.convertTime(90061));
        assertEquals("-1 -1 -1 -1", timeUtils.convertTime(-90061));
    }
}