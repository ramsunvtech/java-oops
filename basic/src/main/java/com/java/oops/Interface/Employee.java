package com.java.oops.Interface;

import com.java.oops.Interface.DB;

/**
 * Created by vramamoorthy on 08/12/16.
 */
public class Employee implements DB {

    public Object connect() {
        return new Object();
    }

    public String chooseDB() {
        return "Selected DB";
    }

    public String selectQuery() {
        return "Select Query";
    }

}