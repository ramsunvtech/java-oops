package com.java.oops.Interface;

import java.util.Objects;

/**
 * Created by vramamoorthy on 08/12/16.
 */
public interface DB {

    Object connect();
    String chooseDB();
    String selectQuery();

    default String employeeList() {
        return "";
    }

    default String staffList() {
        return "";
    }

}
