package com.myProjects.IDontForgetIt.enums;

import java.time.Duration;

public enum TimePeriods {

    DAY(Duration.ofDays(1)),
    WEEK(Duration.ofDays(7)),
    MONTH(Duration.ofDays(30)),
    YEAR(Duration.ofDays(365));

    private final Duration timeInterval;

    TimePeriods(Duration timeInterval) {
        this.timeInterval = timeInterval;
    }

    public Duration getTimeInterval(){
        return timeInterval;
    }
}
