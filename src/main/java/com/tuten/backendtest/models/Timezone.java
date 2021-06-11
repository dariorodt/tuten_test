package com.tuten.backendtest.models;

import java.time.*;

public class Timezone {
    private String time;
    private String timezone;

    public Timezone(String time, String offset) {
        this.time = LocalTime.parse(time).minusHours(Long.parseLong(offset)).toString();
        this.timezone = "utc";
    }

    public String getTime() {
        return time;
    }

    public String getTimezone() {
        return timezone;
    }
}
