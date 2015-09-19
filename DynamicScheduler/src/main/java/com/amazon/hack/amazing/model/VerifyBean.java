package com.amazon.hack.amazing.model;

import java.sql.Timestamp;

/**
 * Created by Shaffi on 19-09-2015.
 */
public class VerifyBean {
    Timestamp timestamp;
    int count;

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public VerifyBean(Timestamp timestamp, int count) {
        this.timestamp = timestamp;
        this.count = count;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
