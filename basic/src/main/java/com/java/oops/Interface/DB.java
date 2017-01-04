package com.java.oops.Interface;

import java.util.Objects;

public interface DB {

    Object connect();
    String chooseDB();
    String selectQuery();

    default String employeeList() { return ""; }

    default String staffList() {
        return "";
    }

}
