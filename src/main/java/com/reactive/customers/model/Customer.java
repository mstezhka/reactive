package com.reactive.customers.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.joda.time.DateTime;

public class Customer {
    private int id;
    private String name;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssZZ", timezone="ZZ")
    private DateTime duetime;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssZZ", timezone="ZZ")
    private DateTime jointime;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public DateTime getDuetime() {
//        return duetime.toString("yyyy-MM-dd'T'HH:mm:ssZZ");
//        DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
//        return fmt.print(duetime); // possible formats
        return duetime;
    }
    public void setDuetime(DateTime duetime) {this.duetime = duetime;}

    public DateTime getJointime() {
//        return jointime.toString("yyyy-MM-dd'T'HH:mm:ssZZ");
//        DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
//        return fmt.print(jointime); // possible format
        return jointime;
    }
    public void setJointime(DateTime jointime) {this.jointime = jointime;}

}